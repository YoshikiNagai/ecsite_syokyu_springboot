package com.example.ecsite_syokyu_springboot.Controller;

import javax.servlet.http.HttpSession;

import com.example.ecsite_syokyu_springboot.Service.BuyItemService;
import com.example.ecsite_syokyu_springboot.Service.LoginService;
import com.example.ecsite_syokyu_springboot.Service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
 
@RestController
@RequestMapping("/ecsite_syokyu_springboot")
public class UserCreateController {

	@Autowired
	LoginService loginService;

	@Autowired
	UserService userService;

	@Autowired
	BuyItemService buyItemService;

	@Autowired
	HttpSession session;

	@RequestMapping(value="/userCreate", method=RequestMethod.GET)
	public ModelAndView userCreate(ModelAndView mv) {
		mv.setViewName("userCreate");
		return mv;
	}

	@RequestMapping(value="/userCreateConfirm", method=RequestMethod.POST, produces="text/plain;charset=utf-8")
	public ModelAndView userCreateConfirm(ModelAndView mv, @RequestParam("loginUserId")String loginUserId,
											@RequestParam("loginPassword")String loginPassword,
											@RequestParam("userName")String userName) {

		String next = "userCreateConfirm";

		if(!loginUserId.isEmpty() && !loginPassword.isEmpty() && !userName.isEmpty()){
			session.setAttribute("loginUserId", loginUserId);
			session.setAttribute("loginPassword", loginPassword);
			session.setAttribute("userName", userName);
		}else{
			
			mv.addObject("errorMessage", "Input All Text Box");
			next = "userCreate";
		}
		
		mv.setViewName(next);
		return mv;
	}

	@RequestMapping(value="/userCreateComplete", method=RequestMethod.POST)
	public ModelAndView userCreateComplete(ModelAndView mv) {
		userService.createUser((String)session.getAttribute("loginUserId"), (String)session.getAttribute("loginPassword"), (String)session.getAttribute("userName"));
		
		mv.setViewName("userCreateComplete");
		return mv;
	}
}
