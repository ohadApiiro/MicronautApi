package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller()
public class MoreApi {
    @Get("/more-kitty")
    public String kitty() {
        return "more Kitty";
    }
}
