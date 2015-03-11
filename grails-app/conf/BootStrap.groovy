import excaalibur.User

class BootStrap {

    def init = { servletContext ->

        new User(username: 'seb', password: 'password').save()

    }
    def destroy = {
    }
}
