import org.springframework.context.ApplicationListener

class TestEventService implements ApplicationListener<TestEvent> {
    def void onApplicationEvent(TestEvent e) {
        log.info("Received event! msg = ${e.message}")
    }
}
