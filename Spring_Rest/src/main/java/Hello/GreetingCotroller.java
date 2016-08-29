package Hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by delhivery on 26/8/16.
 */


@RestController
public class GreetingCotroller {
    private static  final  String template = "Hello ,%s";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    // message called on /greeting mapping in browser and print message based on the "name" , default value is World
    public Greetings greeting(@RequestParam(value = "name" ,defaultValue = "World")String name){
        return new Greetings(counter.incrementAndGet(), String.format(template,name));// increment the counter as unique-ID and print the message

    }

}
