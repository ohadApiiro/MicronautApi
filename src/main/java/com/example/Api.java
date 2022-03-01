package com.example;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

@Controller("/api")
public class Api {
    @Get("/hell")
    public String kitty() {
        return "Hello Kitty";
    }

    @Post("post-kitty")
    public String postKitty() {
        return "Post kitty";
    }
}
