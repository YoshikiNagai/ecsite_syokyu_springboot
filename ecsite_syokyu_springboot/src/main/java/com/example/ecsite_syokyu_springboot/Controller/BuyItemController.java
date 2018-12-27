package com.example.ecsite_syokyu_springboot.Controller;

import javax.servlet.http.HttpSession;

import com.example.ecsite_syokyu_springboot.Service.UserBuyItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
 
@RestController
@RequestMapping("/ecsite_syokyu_springboot/buyItem")
public class BuyItemController {

	@Autowired
	HttpSession session;

	@Autowired
	UserBuyItemService userBuyItemService;

	@RequestMapping(value="/confirm", method=RequestMethod.POST)
	public ModelAndView buyItem(ModelAndView mv, @RequestParam("stock")String stock, @RequestParam("pay")String pay) {
		session.setAttribute("stock", stock);
		int intStock = Integer.parseInt(stock);
		int intPrice = Integer.parseInt(session.getAttribute("buyItem_price").toString());
		session.setAttribute("buyItem_price", intStock * intPrice);

		String payment;
		if(pay.equals("1")){
			payment = "現金払い";
		}else{
			payment = "クレジットカード";
		}
		session.setAttribute("pay", payment);

		mv.setViewName("buyItemConfirm");
		return mv;
	}

	@RequestMapping(value="/complete", method=RequestMethod.POST)
	public ModelAndView buyItemConfirm(ModelAndView mv) {
		userBuyItemService.createBuyItemInfo(session.getAttribute("id").toString(), 
											session.getAttribute("login_user_id").toString(), 
											session.getAttribute("buyItem_price").toString(), 
											session.getAttribute("stock").toString(), 
											session.getAttribute("pay").toString()
											);
		mv.setViewName("buyItemComplete");
		return mv;
	}
}