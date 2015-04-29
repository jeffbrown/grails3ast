package demo

import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(DemoController)
class DemoControllerSpec extends Specification {

    void "test something"() {
        when:
        controller.index()

        then:
        response.contentAsString == 'The Magic Number Is 42'
    }
}
