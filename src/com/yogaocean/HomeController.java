package com.yogaocean;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String showIndex() {
		return "index";
	}
	
	@RequestMapping("/form")
	public String showForm() {
		return "form";
	}
	
	@RequestMapping("/submitForm")
	public String processForm(HttpServletRequest request, Model model) {
		
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String age = request.getParameter("age");
		
		return "form_response";
	}
}
