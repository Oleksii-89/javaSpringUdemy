package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	// need a controller method to show the initial HTML form.
	@GetMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	// need a controller method to process the HTML form.
	@GetMapping("/processForm")
	public String processForm() {
		return "helloword";
	}
	
	//new a controller method to read data and
	// add data to the model
	
	@GetMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		//read the request parameter from HTML form
		String theName = request.getParameter("studentName");
		
		// convert the data to all caps
		theName = theName.toUpperCase();
		
		// create the message
		String result = "Yo! " + theName;
		
		// add message to the model
		model.addAttribute("message", result);
		
		return "helloword";
	}
	
	@GetMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName,
			Model model) {
		
	
		// convert the data to all caps
		theName = theName.toUpperCase();
		
		// create the message
		String result = "Hello from v3! " + theName;
		
		// add message to the model
		model.addAttribute("message", result);
		
		return "helloword";
	}
	
	
	
	
	
}












