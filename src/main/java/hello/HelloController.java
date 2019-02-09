package hello;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @CrossOrigin(origins = "http://localhost:8083")
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}