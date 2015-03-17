package excaalibur

import grails.transaction.Transactional
import org.springframework.context.ApplicationListener

@Transactional
class EloRankingCalculationService implements ApplicationListener<MatchFinishedEvent> {

    @Override
    void onApplicationEvent(MatchFinishedEvent matchFinishedEvent) {
        log.info("Calculating new elo ratings...")

        Match match = Match.get(matchFinishedEvent.matchId)
        User homePlayer = match.home
        User awayPlayer = match.away

        int k = 32
        if (homePlayer.eloRating > 2400 && awayPlayer.eloRating > 2400) {
            k = 16
        } else if (homePlayer.eloRating < 2100 || awayPlayer.eloRating < 2100) {
            k = 24
        }

        homePlayer.eloRating += calculateEloRanking(homePlayer, k, matchFinishedEvent.homeScore, matchFinishedEvent.awayScore)
        awayPlayer.eloRating += calculateEloRanking(awayPlayer, k, matchFinishedEvent.awayScore, matchFinishedEvent.homeScore)

        homePlayer.save()
        awayPlayer.save()

        log.info("Rating home: ${homePlayer.eloRating}")
        log.info("Rating away: ${awayPlayer.eloRating}")
    }

    private int calculateEloRanking(User player, int k, int scorePlayer, int scoreOpponent) {
        int score = 0
        if (scorePlayer > scoreOpponent) {
            score = 1
        } else if (scorePlayer == scoreOpponent) {
            score = 0.5
        }

        return k * (score - (1.0 /(10**(1-((scorePlayer-scoreOpponent)/400)))))
    }
}
