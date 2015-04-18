package excaalibur

import spock.lang.Specification

class AuthorSpec extends Specification {

    def "slug gets updated correctly"() {
        when:
        def author = new Author(name: 'Charles Baudelaire').save(flush: true)

        then:
        author.slug == 'charles-baudelaire'
    }
}
