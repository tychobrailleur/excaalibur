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
        runtime 'org.postgresql:postgresql:9.3-1102-jdbc41'
        test 'org.grails:grails-datastore-test-support:1.0.2-grails-2.4'
    }

    plugins {
        build ':jetty:3.0.0'

        compile ':spring-security-core:2.0-RC4'
        compile ':scaffolding:2.1.2'
        compile ':cache:1.1.8'
        compile ':asset-pipeline:2.1.4'
        compile ':sass-asset-pipeline:2.1.1'
        compile ':markdown:1.1.1'
        compile ':quartz:1.0.2'
        compile ':spring-events:1.2'

        runtime ':cache-headers:1.1.7'
        runtime ':hibernate4:4.3.6.1'
        runtime ':jquery:1.11.1'
        runtime ':database-migration:1.4.0'

        test ':build-test-data:2.4.0'
    }
}
