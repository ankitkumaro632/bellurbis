package com.ankit.bellurbis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/home/{name}")
    public String hello0(@PathVariable("name") String name) {
        return "Hello, Welcome To Bellurbis Technologies  " + name;
    }
}
