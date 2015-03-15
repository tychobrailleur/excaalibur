package excaalibur

class KikiDoncJob {
    static triggers = {
      simple repeatInterval: 30000l // execute job once in 30 seconds
    }

    def execute() {
        log.info('Mais kikidonc?')
    }
}
