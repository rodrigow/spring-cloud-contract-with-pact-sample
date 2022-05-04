package com.rodrigow.demo.sccwithpact;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {

    @GetMapping(value = "/greeting")
    public ResponseEntity<GreetingResponse> greetings() {
        return ResponseEntity.ok(new GreetingResponse("Hi there!"));
    }
}
