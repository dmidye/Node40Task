package com.example.helloworld.spock

import com.example.helloworld.resources.HelloWorldResource
import spock.lang.Shared;
import spock.lang.Specification;

class HelloWorldTests extends Specification {

//    @Shared
//    String baseUrl = "http://localhost:8080/hello-world"
    @Shared
    HelloWorldResource hwr = new HelloWorldResource("Hello! How are you today?")

    def "sayHello() should return greeting"() {
        when:
        //def response = new URL(baseUrl).getText()
        def response = hwr.sayHello()

        then:
        response == "Hello! How are you today?"
    }

    def "format() should reverse the given parameter"() {
        when:
//        def res1 = new URL(baseUrl + "/format/reversed").getText()
//        def res2 = new URL(baseUrl + "/format/java").getText()
//        def res3 = new URL(baseUrl + "/format/coffee").getText()
//        def res4 = new URL(baseUrl + "/format/steak").getText()
        def res1 = hwr.format("reversed")
        def res2 = hwr.format("java")
        def res3 = hwr.format("coffee")
        def res4 = hwr.format("steak")

        then:
        res1 == "desrever"
        res2 == "avaj"
        res3 == "eeffoc"
        res4 == "kaets"

    }
}
