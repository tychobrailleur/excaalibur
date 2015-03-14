package excaalibur

import grails.transaction.Transactional

@Transactional
class IncomingMessageService {
    static rabbitSubscribe = 'excaalibur.topic'

    void handleMessage(message) {
        log.info("Received message: ${message}")
    }
}
