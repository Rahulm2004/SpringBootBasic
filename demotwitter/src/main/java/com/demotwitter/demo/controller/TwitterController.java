package com.demotwitter.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TwitterController {
    
	@GetMapping("/login")
	public String login()
	{
		return "Login page";
	}
	//website- 127.0.0.1:8080/login
	
	
	@GetMapping("/landingpage/{user}")
	public String landingpage(@PathVariable("user") String username)
	{
		return "Landing page of "+username;
	}
	//website- 127.0.0.1:8080/landingpage/rahul
	

	@GetMapping("/homepage")
	public String homepage(@RequestParam String name)
	{
		return "Welcome to Homepage"+name;
	}
	//website-localhost:8080/homepage?name=...
	
	@GetMapping("/getlogin")
	public String getLogin(@RequestParam String username,@RequestParam String password) 
	{
		if(username.equals("admin")&&password.equals("123"))
		{
			return "Login Successful";
		}
		else
		{
			return "Login Failed"; 	
		}
	}
	//127.0.0.1:8080/getlogin?username=admin&password=123
}
