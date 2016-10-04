import excaalibur.CacheController
import excaalibur.CacheManager
import excaalibur.UserService
import org.vertx.groovy.core.Vertx

beans = {
    userService(UserService) {
        defaultStartEloRating = 1450
    }

    // vertx(Vertx, grailsApplication.config.vertx.cluster.port, grailsApplication.config.vertx.cluster.host) { bean ->
    //     bean.factoryMethod = 'newVertx'
    // }


    cacheManager(CacheManager) { bean ->
        configFile = 'infinispan/default.xml'
        bean.initMethod = 'init'
    }

    cacheController(CacheController) {
        cacheManager = ref('cacheManager')
    }
}
