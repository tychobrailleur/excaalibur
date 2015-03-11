class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        '/send'(controller: 'sendEvent', action: 'send')
        '/'(controller: 'home', action: 'index')
        "500"(view:'/error')
	}
}
