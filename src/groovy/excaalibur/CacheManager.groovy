package excaalibur

import groovy.util.logging.Log4j
import org.infinispan.Cache
import org.infinispan.manager.DefaultCacheManager

@Log4j
class CacheManager {

    def configFile

    def Cache cache

    def init() {
        log.info("Initializing infinispan cache, configFile ${configFile}")

        if (!configFile) {
            log.warn("Missing infinispan config file; using local cache")

        } else {

            def cm
            try {
                cm = createCacheManager(configFile)
                cm.start()

                initializeCache(cm)
            } catch (e) {
                log.error("Error creating infinispan cache using configuration file ${configFile}. Using local caches.", e)
                e.printStackTrace()
            }
        }
    }

    def createCacheManager(String configFile) {
        return new DefaultCacheManager(configFile)
    }

    def initializeCache(cacheManager) {
        try {
            log.info "Initializing cache: excaaliburCache"
            this.cache = cacheManager.getCache('excaaliburCache')
        } catch (e) {
            log.error("Exception rasied when initializing cache: using local cache.", e)
        }
    }
}
