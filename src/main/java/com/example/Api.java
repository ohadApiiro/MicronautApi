package com.example;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/hello")
public class Api {
    @Get("kitty")
    public String index() {
        return "Hello World";
    }
}
