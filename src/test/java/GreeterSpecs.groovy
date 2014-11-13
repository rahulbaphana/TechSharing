import com.text.printer.Greeter
import spock.lang.Specification

class GreeterSpecs extends Specification {
    def "I will greet you"(){
        given: "a greeter"
            def greeter = new Greeter()

        when: "i want to greet"
            def message = greeter.greet("Rahul")

        then: "Rahul must be greeted"
            message = "Hello Rahul"
    }
}
