package com.example.ecsite_syokyu_springboot.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
 
@RestController
@RequestMapping("/ecsite_syokyu_springboot")
public class HomeController {

    @RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView home(ModelAndView mv) {
		mv.setViewName("home");
		return mv;
    }
    
    @RequestMapping(value="/goLogin", method=RequestMethod.POST)
	public ModelAndView goLoginPost(ModelAndView mv) {
		mv.setViewName("login");
		return mv;
	}
	
	@RequestMapping(value="/goLogin", method=RequestMethod.GET)
	public ModelAndView goLoginGet(ModelAndView mv) {
		mv.setViewName("login");
		return mv;
    }
}