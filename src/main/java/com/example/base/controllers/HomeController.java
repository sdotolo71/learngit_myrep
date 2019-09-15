package com.example.base.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.base.model.Alien;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	public ModelAndView home(@RequestParam(name="whoami",defaultValue="??who are you??",required=false) String alien_name) {
		ModelAndView mv=new ModelAndView("home");
		mv.addObject("alien_name", alien_name);
		return mv;
	}
	
	@RequestMapping("home2")
	public ModelAndView home2(Alien alien) {
		ModelAndView mv=new ModelAndView("home2");
		mv.addObject("alien", alien);
		return mv;
	}

}
