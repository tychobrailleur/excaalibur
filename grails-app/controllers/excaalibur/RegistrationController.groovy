package excaalibur

import org.springframework.security.access.annotation.Secured

@Secured(['IS_AUTHENTICATED_ANONYMOUSLY'])
class RegistrationController {

    def userService

    def index() {
        if (request.method == 'GET') {
            return [user: new User()]
        }

        def user = userService.register(params['username'], params['password'])
        if (user.hasErrors()) {
            return [user: user]
        }

        redirect action: 'register', id: user.id
    }

    def register() {
        def user = User.get(params['id'])

        return [user: user]
    }
}
