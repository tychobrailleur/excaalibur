package excaalibur

import excaalibur.*


class NestedTransactionService {
    static transactional = false

    def doSomething() {

        Book.withNewTransaction {
            def book = new Book(title: 'Another book')
            book.save(flush: true, failOnError: true)
            throw new RuntimeException('expected')
        }
    }
}
