package lemubit.academy.springdocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/hello")
    public Person hello(){
        return new Person("This is awesome!!", 10);
    }
    @GetMapping
    public Person greet(){
        return new Person("Jack", 29);
    }
}
