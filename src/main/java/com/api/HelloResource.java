package com.api;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/hello")
public class HelloResource {

    @GET
    public String sayHello() {
        return "Hello Vishesh, Jersey API is running!";
    }
}