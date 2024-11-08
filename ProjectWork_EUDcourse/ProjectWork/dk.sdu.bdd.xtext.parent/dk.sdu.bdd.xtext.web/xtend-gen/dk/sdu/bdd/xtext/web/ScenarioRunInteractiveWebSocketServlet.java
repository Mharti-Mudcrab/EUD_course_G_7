package dk.sdu.bdd.xtext.web;

import dk.sdu.bdd.xtext.web.services.ScenarioRunInteractiveWebSocket;
import org.eclipse.jetty.websocket.servlet.WebSocketServlet;
import org.eclipse.jetty.websocket.servlet.WebSocketServletFactory;

@SuppressWarnings("all")
public class ScenarioRunInteractiveWebSocketServlet extends WebSocketServlet {
  @Override
  public void configure(final WebSocketServletFactory factory) {
    factory.register(ScenarioRunInteractiveWebSocket.class);
  }
}
