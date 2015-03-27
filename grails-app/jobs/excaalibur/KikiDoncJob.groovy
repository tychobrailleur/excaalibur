package excaalibur

import org.apache.camel.CamelContext
import org.apache.camel.RoutesBuilder
import org.apache.camel.impl.DefaultCamelContext

class KikiDoncJob {

    static triggers = {
      simple repeatInterval: 30000l // execute job once in 30 seconds
    }

    def execute() {
        log.info('Mais kikidonc?')
        sendMessage("direct:start", "This is a test message")
    }
}
