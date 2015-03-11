class SendEventController {
    def send() {
        def params = ['one', 'hot', 'minute']
        int index = new Random().nextInt(params.size)

        publishEvent(new TestEvent(this, params[index]))
    }
}
