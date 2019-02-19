package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {
        @GetMapping("/home")
    public String getHome(){return "index";}
        @GetMapping("/")
   public String getIndex(){return "index";};
        @GetMapping("/ReminiscingAndRetracting")
    public String getRemiminscingAndRetracting(){return "ReminiscingAndRetracting";}
        @GetMapping("/releasing")
    public String getReleasing(){return "releasing";};
        @GetMapping("/rebuilding")
    public String getRebuilding(){return "rebuilding";}
        @GetMapping("/renewing")
    public String getRenewing(){return "renewing";}
    }

