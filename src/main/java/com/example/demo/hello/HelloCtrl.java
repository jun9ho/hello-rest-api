package com.example.demo.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Map;

@RestController
public class HelloCtrl {

    @GetMapping("/hello")
    public Map<String, Object> hello() {
        return Map.of(
                "message", "Hello, World!",
                "timestamp", System.currentTimeMillis(),
                "koreaTime", ZonedDateTime.now(ZoneId.of("Asia/Seoul")).toString()
        );
    }
}
