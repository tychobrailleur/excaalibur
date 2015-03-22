class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        '/messages'(controller: 'messageLog', action: 'list')

        '/send'(controller: 'sendEvent', action: 'send')
        '/send-vertx'(controller: 'sendEvent', action: 'sendVertx')

        '/'(controller: 'home', action: 'index')
        "500"(view:'/error')
    }
}
