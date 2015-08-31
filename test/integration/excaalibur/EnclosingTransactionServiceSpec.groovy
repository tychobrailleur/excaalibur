package excaalibur

import grails.test.spock.IntegrationSpec

class EnclosingTransactionServiceSpec extends IntegrationSpec {
    def enclosingTransactionService

    def cleanup() {
        Book.list()*.delete(flush: true)
    }

    def "test behaviour of enclosing transaction when nested service throws a RuntimeException"() {
        given:
        assert Book.count() == 0

        when:
        enclosingTransactionService.doSomething()

        then:
        Book.count() == 1
        Book.first().title == 'The Lord of the Rings'
    }

    def "test behaviour of transaction when nested service throws a RuntimeException in a try...catch"() {
        given:
        assert Book.count() == 0

        when:
        enclosingTransactionService.doSomethingElse()

        then:
        Book.count() == 1
        Book.first().title == 'The Lord of the Rings'
    }
}
