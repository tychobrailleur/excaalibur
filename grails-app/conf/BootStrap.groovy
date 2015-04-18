import excaalibur.Author
import excaalibur.Match
import excaalibur.User
import org.joda.time.DateTime

class BootStrap {

    def init = { servletContext ->
        seedData()
    }

    def destroy = {
    }

    private void seedData() {
        User user1 = new User(username: 'seb', password: 'password', eloRating: 1450).save()
        User user2 = new User(username: 'joe', password: 'password', eloRating: 1450).save()

        DateTime dateTime = new DateTime()
        new Match(home: user1, away: user2, matchDate: dateTime.plusDays(5)).save()

        new Author(name: 'Charles Baudelaire').save()
    }
}
