package excaalibur

import grails.plugin.springsecurity.SpringSecurityUtils
import grails.test.spock.IntegrationSpec

class MatchControllerIntegrationSpec extends IntegrationSpec {
    def matchController = new MatchController()

    def "check lazy loading in integration spec"() {
        when:
        def result

        SpringSecurityUtils.doWithAuth('seb') {
            result = matchController.list()
        }

        then:
        result
    }
}
