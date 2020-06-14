package heinle.leonardo.exemplolombok.controllers;

import heinle.leonardo.exemplolombok.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String index() {
        return "Exemplo lombok";
    }
}
