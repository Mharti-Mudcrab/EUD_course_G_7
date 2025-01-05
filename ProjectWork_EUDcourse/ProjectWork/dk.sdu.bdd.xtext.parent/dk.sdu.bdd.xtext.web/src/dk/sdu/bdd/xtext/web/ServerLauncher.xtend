package dk.sdu.bdd.xtext.web

import java.net.InetSocketAddress
import org.eclipse.jetty.annotations.AnnotationConfiguration
import org.eclipse.jetty.server.Server
import org.eclipse.jetty.servlet.ServletContextHandler
import org.eclipse.jetty.servlet.ServletHolder
import org.eclipse.jetty.util.log.Slf4jLog
import org.eclipse.jetty.webapp.MetaInfConfiguration
import org.eclipse.jetty.webapp.WebAppContext
import org.eclipse.jetty.webapp.WebInfConfiguration
import org.eclipse.jetty.webapp.WebXmlConfiguration
import org.eclipse.jetty.websocket.servlet.WebSocketServlet
import org.eclipse.jetty.websocket.servlet.WebSocketServletFactory
import dk.sdu.bdd.xtext.web.services.ScenarioRunInteractiveWebSocket
import org.eclipse.jetty.server.handler.ContextHandlerCollection

// Java WebSocketServlet to register the ScenarioWebSocket endpoint
class ScenarioRunInteractiveWebSocketServlet extends WebSocketServlet {
    override configure(WebSocketServletFactory factory) {
        factory.register(ScenarioRunInteractiveWebSocket)  // Register the Java WebSocket class
    }
}

class ServerLauncher {

    def static void main(String[] args) {
        val server = new Server(new InetSocketAddress('localhost', 8080))
        val server2 = new Server(new InetSocketAddress('localhost', 8081))

        // WebAppContext: For serving static files (like HTML, CSS, JS)
        val webAppContext = new WebAppContext => [
            resourceBase = 'WebRoot'
            welcomeFiles = #["index.html"]
            contextPath = "/"
            configurations = #[
                new AnnotationConfiguration,
                new WebXmlConfiguration,
                new WebInfConfiguration,
                new MetaInfConfiguration
            ]
            setAttribute(WebInfConfiguration.CONTAINER_JAR_PATTERN, '.*/dk\\.sdu\\.bdd\\.xtext\\.web/.*,.*\\.jar')
            setInitParameter("org.eclipse.jetty.servlet.Default.useFileMappedBuffer", "false")
        ]
        webAppContext.getServletHandler().setEnsureDefaultServlet(false)
        
		val servletContextHandler = new ServletContextHandler(ServletContextHandler.SESSIONS)
		servletContextHandler.contextPath = "/"
		servletContextHandler.resourceBase = 'services'
		val servletHolder = new ServletHolder("websocket", ScenarioRunInteractiveWebSocketServlet)
		servletContextHandler.addServlet(servletHolder, "/run-scenario-interactive")

		//val handlerCollection = new ContextHandlerCollection()
	    //handlerCollection.addHandler(servletContextHandler)
	    //handlerCollection.addHandler(webAppContext)
	    //server.setHandler(handlerCollection)
	
	    server.setHandler(webAppContext)
	    server2.setHandler(servletContextHandler)

        // Logging and server startup logic
        val log = new Slf4jLog(ServerLauncher.name)
        try {
            server.start
            server2.start
            log.info('Server started ' + server.getURI + '...')
            new Thread[ // Graceful shutdown listener
                log.info('Press enter to stop the server...')
                val key = System.in.read
                if (key != -1) {
                    server.stop
                } else {
                    log.warn('Console input is not available. In order to stop the server, you need to cancel the process manually.')
                }
            ].start
            server.join
            server2.join
        } catch (Exception exception) {
            log.warn(exception.message)
            System.exit(1)
        }
    }
}
