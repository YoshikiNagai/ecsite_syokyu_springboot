package com.example.ecsite_syokyu_springboot.Controller;

import javax.servlet.http.HttpSession;

import com.example.ecsite_syokyu_springboot.Entity.BuyItem;
import com.example.ecsite_syokyu_springboot.Entity.Login;
import com.example.ecsite_syokyu_springboot.Service.BuyItemService;
import com.example.ecsite_syokyu_springboot.Service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
 
@RestController
@RequestMapping("/ecsite_syokyu_springboot")
public class LoginController {

	@Autowired
	LoginService loginService;

	@Autowired
	BuyItemService buyItemService;

	@Autowired
	HttpSession session;
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView login(ModelAndView mv, @RequestParam("loginUserId")String loginUserId, 
							@RequestParam("loginPassword")String loginPassword) {

		Login login = loginService.getLoginUserInfo(loginUserId, loginPassword);
		session.setAttribute("loginUser", login);
		
		if(((Login)session.getAttribute("loginUser")).getLoginFlg()){
			BuyItem buyItem = buyItemService.getBuyItemInfo();
			session.setAttribute("login_user_id", login.getLoginId());
			session.setAttribute("id", buyItem.getId());
			session.setAttribute("buyItem_name", buyItem.getItemName());
			session.setAttribute("buyItem_price", buyItem.getItemPrice());
			mv.setViewName("buyItem");
			return mv;
		}
		
		mv.setViewName("home");
		return mv;
	}
}
