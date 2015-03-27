grails.servlet.version = '3.0'
grails.project.work.dir = 'target'
grails.project.target.level = 1.7
grails.project.source.level = 1.7

grails.project.fork = [
    test: [maxMemory: 768, minMemory: 64, debug: false, maxPerm: 256, daemon:true],
    run: [maxMemory: 768, minMemory: 64, debug: false, maxPerm: 256, forkReserve:false],
    war: [maxMemory: 768, minMemory: 64, debug: false, maxPerm: 256, forkReserve:false],
    console: [maxMemory: 768, minMemory: 64, debug: false, maxPerm: 256]
]

grails.server.port.http = 9092

grails.project.dependency.resolver = 'maven'
grails.project.dependency.resolution = {
    inherits('global')
    log 'error'
    checksums true
    legacyResolve false

    repositories {
        inherits true // Whether to inherit repository definitions from plugins

        grailsPlugins()
        grailsHome()
        grailsCentral()

        mavenLocal()
        mavenCentral()
    }

    dependencies {
        compile 'joda-time:joda-time:2.7', 
                'io.vertx:vertx-core:2.1.5',
                'io.vertx:lang-groovy:2.1.1-final',
                'io.vertx:vertx-platform:2.1.5',
                'io.vertx:vertx-hazelcast:2.1.5'

        runtime 'org.postgresql:postgresql:9.3-1102-jdbc41'
        test 'org.grails:grails-datastore-test-support:1.0.2-grails-2.4'
    }

    plugins {
        build ':jetty:3.0.0'

        compile ':spring-security-core:2.0-RC4',
                ':scaffolding:2.1.2',
                ':cache:1.1.8',
                ':asset-pipeline:2.1.4',
                ':sass-asset-pipeline:2.1.1',
                ':markdown:1.1.1',
                ':quartz:1.0.2',
                ':spring-events:1.2',
                ':console:1.5.4',
                ':dbconsole:1.1',
                ':rabbitmq:1.0.0',
                ':routing:1.4.1'

       runtime ':cache-headers:1.1.7',
                ':hibernate4:4.3.6.1',
                ':jquery:1.11.1',
                ':database-migration:1.4.0'

        test ':build-test-data:2.4.0'
    }
}
