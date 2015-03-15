package excaalibur

import grails.transaction.Transactional

@Transactional
class IncomingMessageService {
    static rabbitSubscribe = 'excaalibur.topic'

    void handleMessage(message) {
        log.info("Received message: ${new String(message, 'utf-8')}")

        new MessageLog(message: new String(message, 'utf-8')).save(flush: true)
    }
}
