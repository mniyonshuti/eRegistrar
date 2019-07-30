package edu.mum.cs425.demos.eRegistrar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping(value = {"/eregistrar", "/home/eregistrar"})
	public String displayHomePage() {
		return "home/index";
	}

}
