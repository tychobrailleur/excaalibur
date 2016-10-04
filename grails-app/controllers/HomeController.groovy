import excaalibur.*
import grails.plugin.springsecurity.annotation.Secured

@Secured('permitAll')
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
