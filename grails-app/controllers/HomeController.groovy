import excaalibur.*

class HomeController {
    def enclosingTransactionService

    def index() {}

    def test() {
        enclosingTransactionService.doSomething()

        def books = Book.list()
        log.info "Books: ${books.size()}"

        [books : Book.list()]
    }
}
