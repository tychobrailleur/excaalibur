package excaalibur

import excaalibur.exception.RegistrationException
import grails.transaction.Transactional

@Transactional
class UserService {
    int defaultStartEloRating

    def register(String username, String password) {
        def user = User.findByUsername(username)
        if (user) {
            throw new RegistrationException('User already exists.')
        }

        new User(username: username, password: password, eloRating: defaultStartEloRating).save()
    }
}
