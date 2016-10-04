package excaalibur

import grails.plugin.springsecurity.annotation.Secured

@Secured('IS_AUTHENTICATED_FULLY')
class CacheController {

    def cacheManager

    def index() {
        def valueFromCache = cacheManager.cache.get('test')
        [value: valueFromCache]
    }

    def add() {
        cacheManager.cache.put('test', new Date())
    }
}
