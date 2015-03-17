package excaalibur

import org.springframework.context.ApplicationEvent

class MatchFinishedEvent extends ApplicationEvent {
    long matchId
    int homeScore
    int awayScore

    MatchFinishedEvent(long matchId, int homeScore, int awayScore, def source) {
        super(source)
        this.homeScore = homeScore
        this.awayScore = awayScore
        this.matchId = matchId
    }
}
