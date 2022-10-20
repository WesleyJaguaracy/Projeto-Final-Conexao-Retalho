package br.com.entra21.conexaoretalho.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index() {
		return "index.html";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
		
	}
	
	@RequestMapping("/principal")
	public String principal() {
		return "principal";
	}

}