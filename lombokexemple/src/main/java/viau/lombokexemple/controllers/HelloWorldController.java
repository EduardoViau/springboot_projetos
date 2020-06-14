package viau.lombokexemple.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import viau.lombokexemple.model.Client;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String index() {
        return "exemple lombok";
    }
}
