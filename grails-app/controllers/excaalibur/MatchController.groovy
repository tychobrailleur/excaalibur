package excaalibur

import grails.plugin.springsecurity.annotation.Secured

@Secured('IS_AUTHENTICATED_FULLY')
class MatchController {

    static allowedMethods = [ submitScore: 'POST' ]

    def list() {
        [matches: Match.list()]
    }

    def index() {
        Match match = Match.get(params.int('id'))

        log.info("Match: ${match}")

        [match: match]
    }

    def submitScore() {
        int matchId = params.int('matchId')
        int homeScore = params.int('homeScore')
        int awayScore = params.int('awayScore')

        Match match = Match.get(matchId)
        match.scoreHome = homeScore
        match.scoreAway = awayScore
        match.finished = true
        match.save(flush: true)

        publishEvent(new MatchFinishedEvent(match.id, homeScore, awayScore, this))

        redirect action: "list"
    }
}
