import excaalibur.UserService
import org.vertx.groovy.core.Vertx

beans = {
    userService(UserService) {
        defaultStartEloRating = 1450
    }

    // vertx(Vertx, grailsApplication.config.vertx.cluster.port, grailsApplication.config.vertx.cluster.host) { bean ->
    //     bean.factoryMethod = 'newVertx'
    // }
}
