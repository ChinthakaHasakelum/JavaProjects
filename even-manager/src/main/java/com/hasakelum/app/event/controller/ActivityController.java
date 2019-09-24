package com.hasakelum.app.event.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hasakelum.app.event.model.Activity;

@Controller
public class ActivityController {

	
	@RequestMapping(value="/greeting") 
	public String getWelcomeMessage(Model model){
		System.out.println("Entered to controller");
		model.addAttribute("message","Hi Spring MVC....You Look handy!");
		return "welcome";
		
	}
	
	
	@RequestMapping(value="/addactivity")
	public String AddActivity(@ModelAttribute("activities") Activity activity){
		
		
		if(activity.getActivityName()==null){
			return "addActivity";
		}
		else{
			System.out.println(activity.getActivityName());
		return  "redirect:addsubactivity.html";
		
		}
	}
	
	@RequestMapping(value="/addsubactivity")
	public String AddSubActivity(@ModelAttribute("activities") Activity activity){
		System.out.println("SubActivity is: "+activity.getActivityName());
		
		return  "addActivity";
	}
	
}
