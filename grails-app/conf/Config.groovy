grails.project.groupId = appName

// The ACCEPT header will not be used for content negotiation for user agents containing the following strings (defaults to the 4 major rendering engines)
grails.mime.disable.accept.header.userAgents = ['Gecko', 'WebKit', 'Presto', 'Trident']
grails.mime.types = [ // the first one is the default format
    all:           '*/*', // 'all' maps to '*' or the first available format in withFormat
    atom:          'application/atom+xml',
    css:           'text/css',
    csv:           'text/csv',
    form:          'application/x-www-form-urlencoded',
    html:          ['text/html','application/xhtml+xml'],
    js:            'text/javascript',
    json:          ['application/json', 'text/json'],
    multipartForm: 'multipart/form-data',
    rss:           'application/rss+xml',
    text:          'text/plain',
    hal:           ['application/hal+json','application/hal+xml'],
    xml:           ['text/xml', 'application/xml']
]
// Legacy setting for codec used to encode data with ${}
grails.views.default.codec = 'html'
grails.controllers.defaultScope = 'singleton'

// GSP settings
grails {
    views {
        gsp {
            encoding = 'UTF-8'
            htmlcodec = 'xml'
            codecs {
                expression = 'html' // escapes values inside ${}
                scriptlet = 'html' // escapes output from scriptlets in GSPs
                taglib = 'none' // escapes output from taglibs
                staticparts = 'none' // escapes output from static template parts
            }
        }
    }
}


grails.converters.encoding = "UTF-8"
grails.scaffolding.templates.domainSuffix = 'Instance'

grails.json.legacy.builder = false
grails.enable.native2ascii = true
grails.spring.bean.packages = []
grails.web.disable.multipart=false

grails.exceptionresolver.params.exclude = ['password']

grails.hibernate.cache.queries = false

grails.hibernate.pass.readonly = false
grails.hibernate.osiv.readonly = false

environments {
    development {
        grails.logging.jul.usebridge = true

        // Security Debug filter:
        grails.plugin.springsecurity.debug.useFilter = true
    }
    production {
        grails.logging.jul.usebridge = false
    }
}

rabbitmq {
    connectionfactory {
        username = 'guest'
        password = 'guest'
        hostname = 'localhost'
    }
    queues = {
        exchange name: 'excaalibur.topic', type: topic, durable: true, autoDelete: false
    }
}

vertx {
    cluster {
        port = 5544
        host = 'localhost'
    }
}

// log4j configuration
log4j.main = {
    appenders {
        file name: 'file', file: 'logs/development.log'
    }
    root {
        info 'stdout', 'file'
    }
    error  'org.codehaus.groovy.grails.web.servlet',        // controllers
           'org.codehaus.groovy.grails.web.pages',          // GSP
           'org.codehaus.groovy.grails.web.sitemesh',       // layouts
           'org.codehaus.groovy.grails.web.mapping.filter', // URL mapping
           'org.codehaus.groovy.grails.web.mapping',        // URL mapping
           'org.codehaus.groovy.grails.commons',            // core / classloading
           'org.codehaus.groovy.grails.plugins',            // plugins
           'org.codehaus.groovy.grails.orm.hibernate',      // hibernate integration
           'org.codehaus.groovy.grails.io.support',
           'org.springframework',
           'org.hibernate',
           'org.apache',
           'net.sf.ehcache.hibernate'

    // Security Debug info:
    debug 'org.springframework.security'
    info 'grails.plugin.springsecurity.web.filter.DebugFilter'

    debug 'friendlyurl'
    debug 'excaalibur'
}


// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'excaalibur.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'excaalibur.UserRole'
grails.plugin.springsecurity.authority.className = 'excaalibur.Role'

//grails.plugin.springsecurity.securityConfigType = 'InterceptUrlMap'

grails.plugin.springsecurity.controllerAnnotations.staticRules = [
//grails.plugin.springsecurity.interceptUrlMap = [
    '/': ['permitAll'],
//    '/home/**': ['permitAll'],
//    '/login/**': ['permitAll'],
    '/domain/**': ['permitAll'],
    '/index': ['permitAll'],
    '/index.gsp': ['permitAll'],
    '/send': ['permitAll'],
    '/send-vertx': ['permitAll'],
    '/assets/**': ['permitAll'],
    '/dbconsole/**': ['permitAll'],
    '/console/**': ['permitAll'],
    '/header.tpl.html': ['permitAll'],
    '/**/js/**': ['permitAll'],
    '/**/css/**': ['permitAll'],
    '/**/images/**': ['permitAll'],
    '/**/favicon.ico': ['permitAll']
]

healthcheck.checkDb = true