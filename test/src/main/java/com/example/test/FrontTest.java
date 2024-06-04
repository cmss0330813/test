package com.example.test;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class FrontTest {
    @RequestMapping(value = "/api/hello", method = RequestMethod.GET)
    //@ResponseStatus(value = HttpStatus.OK)
    public String test() {
        return "hello world";
    }
}
