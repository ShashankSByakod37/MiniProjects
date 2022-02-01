package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("home")
public class AddController {

	
	
	@RequestMapping("/resp")
	@ResponseBody
	public  String resp() {
//		System.out.println("hey im from resp");
		return "hey im from resp" ;
	}
	
	@RequestMapping("msg")
	
	public ModelAndView str(Model model) {
		return new ModelAndView("success","msg","Successfully entered msg");
		
	}
	@RequestMapping("inline")
	public String InLine(Model model) {
		
		model.addAttribute("msg","hello from inline ");
		
		return "inLine";
		
	}
	
}
