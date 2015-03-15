package excaalibur

class MessageLog {

    String message

    Date dateCreated = new Date()
    Date lastUpdated = new Date()


    static constraints = {
        message nullable: false, blank: false
    }

    static mapping = {
        message type: 'text'
    }
}
