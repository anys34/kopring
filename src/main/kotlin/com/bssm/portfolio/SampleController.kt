package com.bssm.portfolio

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController {
    @GetMapping("/hello")
    fun hello(): String {
        return "hello";
    }

//    java
//    public Stirng hello() {
//        return "hello";
//    }
}