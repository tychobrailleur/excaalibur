package excaalibur

import excaalibur.*

class EnclosingTransactionService {
    def nestedTransactionService

    def doSomething() {
        createBook()
        createOtherBookNestedTransaction()
    }

    private createBook() {
        def book = new Book(title: 'The Lord of the Rings')
        book.save(flush: true)
    }

    private createOtherBookNestedTransaction() {
        try {
            nestedTransactionService.doSomething()
        } catch  (Exception e) {
            log.error("Exception nested transaction", e)
        }
    }
}
