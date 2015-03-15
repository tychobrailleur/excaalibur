package excaalibur

import org.springframework.security.access.annotation.Secured

@Secured(['IS_AUTHENTICATED_ANONYMOUSLY'])
class MessageLogController {

    def index() { }

    def list() {
        [messages: MessageLog.list()]
    }
}
