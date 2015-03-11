import org.springframework.context.ApplicationEvent

class TestEvent extends ApplicationEvent {
    def message
    
    TestEvent(def source, def message) {
        super(source)
        this.message = message
    }
}
