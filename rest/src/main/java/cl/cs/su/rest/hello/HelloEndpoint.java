package cl.cs.su.rest.hello;

import cl.cs.su.core.hello.controller.DefaultHelloController;
import cl.cs.su.rest.WFMEndpointPaths;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloEndpoint {
    private DefaultHelloController helloController;

    public HelloEndpoint(DefaultHelloController helloController) {
        this.helloController = helloController;
    }

    @RequestMapping(value = WFMEndpointPaths.Hello.HELLO, method = RequestMethod.GET)
    private String getHelloMessage() {
        return this.helloController.geMessage();
    }
}
