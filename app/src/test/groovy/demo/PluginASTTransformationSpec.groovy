package demo

import helper.MagicNumber
import spock.lang.Specification

class PluginASTTransformationSpec extends Specification {

    void 'test that ast transformation provided by plugin is working'() {
        expect:
        new SomeClass().magicNumber == 42
    }
}

@MagicNumber
class SomeClass{}
