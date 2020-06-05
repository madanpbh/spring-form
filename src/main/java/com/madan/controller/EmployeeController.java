package com.madan.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.madan.model.Employee;

@Controller
public class EmployeeController {

	@RequestMapping("/show")  
	public ModelAndView show() {  
		ModelAndView mav = new ModelAndView();   
		mav.setViewName("Register");  
		return mav;  
		}
	
	@RequestMapping("/reg")  
	public ModelAndView Register(@ModelAttribute("employee")Employee emp) {  
		ModelAndView mav = new ModelAndView();   
		mav.setViewName("Register");   
		mav.addObject("emp" , emp);   
		return mav; 
		} 
	@RequestMapping("show1")  
	public String showPages(Model m) {   
		m.addAttribute("msg", "Welcome App:" +new Date());   
		return "Home";  
		} 
}
