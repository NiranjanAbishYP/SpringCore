package com.SpringBootDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootDemo.Model.EmployeeModel;

@Controller
public class MyController {

	@Autowired
	EmployeeModel employeeModel;
	
	@GetMapping(value="/jspdemo")
	public String myFunction()
	{
		return "Welcome";
	}
	
	@GetMapping(value="login")
	public String login(Model model)
	{
		model.addAttribute("empModel", employeeModel);
		return "Login";
	}
	
	@RequestMapping(value="welcomeuser", method=RequestMethod.POST)
	public String welcome(@ModelAttribute("empModel") EmployeeModel employeeModel)
	{
		return "WelcomeUser";
	}
	
}
