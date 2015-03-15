package excaalibur

import grails.converters.JSON
import grails.transaction.Transactional
import org.springframework.context.ApplicationListener

@Transactional
class ProcessMessageService implements ApplicationListener<MessageEvent> {

    @Override
    void onApplicationEvent(MessageEvent messageEvent) {
        String code = messageEvent.code

        switch (code) {
            case 'F111':
                log.info('Process F111')
                def o = JSON.parse(messageEvent.message)

                log.info("Agent id = ${o.agent_id}")
                break
            default:
                log.info('Do nothing.')
        }
    }
}
