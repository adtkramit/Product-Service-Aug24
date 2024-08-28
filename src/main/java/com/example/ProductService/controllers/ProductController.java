package com.example.ProductService.controllers;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ProductController {

    // Endpoint name: GET /hello
    @GetMapping("/hello")
    public String helloWorld() {
         System.out.println("Hello world");
         return "Hello world via return param";
    }

    // Endpoint name: GET /hello/{name}
    @GetMapping("/hello/{name}")
    public String helloWithName(@PathVariable("name") String name) {
        return "Hello " + name;
    }

    // Endpoint with multiple vars  GET /show/{showId}/seat/{seatId}
    @GetMapping("/show/{showId}/seat/{seatId}")
    public String bmsExample(@PathVariable("showId") String showId, @PathVariable("seatId") int seatId) {
        return "Hello " + showId + " " + seatId;
    }

}
