package gormgraphql

import grails.gorm.services.Service
import groovy.transform.CompileStatic

@CompileStatic
@Service(Speaker)
interface SpeakerDataService {
    Speaker save(String name)
}