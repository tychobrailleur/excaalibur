package excaalibur

import org.springframework.context.ApplicationEvent

class MessageEvent extends ApplicationEvent {
    String code
    String message

    MessageEvent(String code, String message, def source) {
        super(source)
        this.code = code
        this.message = message
    }
}
