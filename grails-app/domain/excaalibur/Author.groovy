package excaalibur

class Author {

    String name
    String slug

    static slugCandidate = [ 'name' ]
    static hasMany = [ books: Book ]

    static constraints = {
        slug nullable: true, blank: false
        name blank: false
    }
}
