package excaalibur

import grails.transaction.Transactional

import grails.converters.*
import org.codehaus.groovy.grails.web.json.* // package containing JSONObject, JSONArray,...



@Transactional
class OtherIncomingMessageService {
    static rabbitSubscribe = 'excaalibur.topic'

    void handleMessage(message) {
        String m = new String(message, 'utf-8')
        def o = JSON.parse(m) // Parse a JSON String

        log.info("Code = ${o.code}")
    }
}
