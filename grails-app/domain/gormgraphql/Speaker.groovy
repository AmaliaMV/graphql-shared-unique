package gormgraphql

import grails.compiler.GrailsCompileStatic
import grails.rest.Resource

@Resource(uri='/speaker')
@GrailsCompileStatic
class Speaker {

    static mapWith = "neo4j"
    static graphql = true

    String name

    static constraints = {
        name shared: 'uniqueName'
    }

}