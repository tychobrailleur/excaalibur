package excaalibur

import grails.plugin.springsecurity.annotation.Secured

@Secured(['IS_AUTHENTICATED_ANONYMOUSLY'])
class MessageLogController {

    def index() { }

    def list() {
        [messages: MessageLog.list()]
    }
}
