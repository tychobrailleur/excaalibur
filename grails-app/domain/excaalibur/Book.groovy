package excaalibur

class Book {

    String title

    static hasMany = [ authors: Author ]
    static belongsTo = [ Author ]

    static constraints = {
        title nullable: false, blank: false
    }
}
