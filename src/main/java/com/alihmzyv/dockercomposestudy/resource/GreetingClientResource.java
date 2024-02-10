package com.alihmzyv.dockercomposestudy.resource;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@RequestMapping
@RestController
public class GreetingClientResource {
    private final RestTemplate restTemplate;

    @GetMapping("/call-service-2")
    public String greet() {
        ResponseEntity<String> response = restTemplate.getForEntity("http://service-2:8081/greet", String.class);
        return response.getBody().concat(" (from service 1 calling service 2)");
    }
}
