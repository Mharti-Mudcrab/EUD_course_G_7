package dk.sdu.bdd.xtext.web;

import java.net.InetSocketAddress;
import java.net.URI;
import org.eclipse.jetty.annotations.AnnotationConfiguration;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.util.log.Slf4jLog;
import org.eclipse.jetty.webapp.Configuration;
import org.eclipse.jetty.webapp.MetaInfConfiguration;
import org.eclipse.jetty.webapp.WebAppContext;
import org.eclipse.jetty.webapp.WebInfConfiguration;
import org.eclipse.jetty.webapp.WebXmlConfiguration;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class ServerLauncher {
  public static void main(final String[] args) {
    InetSocketAddress _inetSocketAddress = new InetSocketAddress("localhost", 8080);
    final Server server = new Server(_inetSocketAddress);
    InetSocketAddress _inetSocketAddress_1 = new InetSocketAddress("localhost", 8081);
    final Server server2 = new Server(_inetSocketAddress_1);
    WebAppContext _webAppContext = new WebAppContext();
    final Procedure1<WebAppContext> _function = (WebAppContext it) -> {
      it.setResourceBase("WebRoot");
      it.setWelcomeFiles(new String[] { "index.html" });
      it.setContextPath("/");
      AnnotationConfiguration _annotationConfiguration = new AnnotationConfiguration();
      WebXmlConfiguration _webXmlConfiguration = new WebXmlConfiguration();
      WebInfConfiguration _webInfConfiguration = new WebInfConfiguration();
      MetaInfConfiguration _metaInfConfiguration = new MetaInfConfiguration();
      it.setConfigurations(new Configuration[] { _annotationConfiguration, _webXmlConfiguration, _webInfConfiguration, _metaInfConfiguration });
      it.setAttribute(WebInfConfiguration.CONTAINER_JAR_PATTERN, ".*/dk\\.sdu\\.bdd\\.xtext\\.web/.*,.*\\.jar");
      it.setInitParameter("org.eclipse.jetty.servlet.Default.useFileMappedBuffer", "false");
    };
    final WebAppContext webAppContext = ObjectExtensions.<WebAppContext>operator_doubleArrow(_webAppContext, _function);
    webAppContext.getServletHandler().setEnsureDefaultServlet(false);
    final ServletContextHandler servletContextHandler = new ServletContextHandler(ServletContextHandler.SESSIONS);
    servletContextHandler.setContextPath("/");
    servletContextHandler.setResourceBase("services");
    final ServletHolder servletHolder = new ServletHolder("websocket", ScenarioRunInteractiveWebSocketServlet.class);
    servletContextHandler.addServlet(servletHolder, "/run-scenario-interactive");
    server.setHandler(webAppContext);
    server2.setHandler(servletContextHandler);
    String _name = ServerLauncher.class.getName();
    final Slf4jLog log = new Slf4jLog(_name);
    try {
      server.start();
      server2.start();
      URI _uRI = server.getURI();
      String _plus = ("Server started " + _uRI);
      String _plus_1 = (_plus + "...");
      log.info(_plus_1);
      final Runnable _function_1 = () -> {
        try {
          log.info("Press enter to stop the server...");
          final int key = System.in.read();
          if ((key != (-1))) {
            server.stop();
          } else {
            log.warn("Console input is not available. In order to stop the server, you need to cancel the process manually.");
          }
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      };
      new Thread(_function_1).start();
      server.join();
      server2.join();
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception exception = (Exception)_t;
        log.warn(exception.getMessage());
        System.exit(1);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}
