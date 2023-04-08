package com.web.onpe.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Configuration
@CrossOrigin
@Controller

public class OnpeController {
	
    @GetMapping("/index")
    public String Onpe() {
	return "index";
     }

}
