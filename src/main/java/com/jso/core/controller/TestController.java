package com.jso.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class TestController {

	@RequestMapping("/hello")
	public String hello(@RequestParam(value="name", required=false, defaultValue="World") final String name, final Model model) {
		model.addAttribute("msg", "Hello " + name);
		return "TestPage";
	}
}
