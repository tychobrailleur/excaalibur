package excaalibur

class Match {

    User home
    User away

    Integer scoreHome
    Integer scoreAway

    Date matchDate

    boolean finished = false

    static constraints = {
        home nullable: false
        away nullable: false
        scoreHome nullable: true
        scoreAway nullable: true
        matchDate nullable: true
    }
}
