package com.example.shithole.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shit")
public class ShitController {

    @GetMapping()
    public String getShit() {
        return "SHIT";
    }
}
