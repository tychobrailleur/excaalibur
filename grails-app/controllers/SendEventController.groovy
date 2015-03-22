import org.springframework.security.access.annotation.Secured

@Secured(['IS_AUTHENTICATED_ANONYMOUSLY'])
class SendEventController {
    def vertx

    def send() {
        publishEvent(new TestEvent(this, produceRandomWord()))
    }

    def sendVertx() {
        vertx.eventBus.publish('excaalibur.words', produceRandomWord())
    }

    private String produceRandomWord() {
        def params = ['one', 'hot', 'minute']
        int index = new Random().nextInt(params.size)

        return params[index]
    }
}
