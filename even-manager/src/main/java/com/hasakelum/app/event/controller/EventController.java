package com.hasakelum.app.event.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hasakelum.app.event.model.Event;

@Controller
public class EventController {
	
	@RequestMapping(value="/Event",method=RequestMethod.GET)
	
	public String getEvent(Model model){
		
		Event event=new Event();
		event.setEventName("Wedding");
		
		model.addAttribute("event",event);
		return "addEvent";
	}
	
	
@RequestMapping(value="/Event",method=RequestMethod.POST)
	
	public String UpdateEvent(@Valid @ModelAttribute("event") Event event,BindingResult result){
	
		if(result.hasErrors()){
			System.out.println("Payload has errors");
			return "addEvent";
			
		}
		else{
	
		System.out.println("Event Updated as: "+event.getEventName());
		return "redirect:addactivity.html";
		}
	}
	
	
}
