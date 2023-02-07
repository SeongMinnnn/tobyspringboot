package tobyspring.helloboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import toby.helloboot.SimpleHelloService;

import java.util.Objects;

@RestController
public class HelloController {
    public final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hello")
    public String hello(String name){
        if(name == null || name.trim().length() == 0)throw new IllegalAccessException();

        return helloService.sayHello(name) ;
    }
}