package excaalibur

import org.apache.camel.builder.RouteBuilder
import org.apache.camel.component.websocket.WebsocketComponent

class WebSocketRoute extends RouteBuilder {
    def grailsApplication

    @Override
    void configure() {
        def config = grailsApplication?.config

//        WebsocketComponent wc = getContext().getComponent("websocket", WebsocketComponent.class)
//        wc.setPort(9092)
//        wc.setStaticResources("classpath:.")

        // from('direct:start').to("websocket:camel-?sendToAll=true")

        from('direct:start').to("stream:out")
    }
}