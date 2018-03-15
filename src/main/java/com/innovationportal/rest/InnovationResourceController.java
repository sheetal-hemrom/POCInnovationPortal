package com.innovationportal.rest;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/")
public class InnovationResourceController {

    @RequestMapping("innovations")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
