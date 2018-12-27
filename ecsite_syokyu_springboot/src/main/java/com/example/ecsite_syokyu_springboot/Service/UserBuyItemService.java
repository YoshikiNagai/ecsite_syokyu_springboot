package com.example.ecsite_syokyu_springboot.Service;

import javax.transaction.Transactional;

import com.example.ecsite_syokyu_springboot.Entity.UserBuyItem;
import com.example.ecsite_syokyu_springboot.Repository.UserBuyItemRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserBuyItemService {
 
	@Autowired
	UserBuyItemRepository repository;

	public void createBuyItemInfo(String item_transaction_id, String user_master_id, String total_price, String total_count, String pay) {
		UserBuyItem userBuyItem = new UserBuyItem();
		userBuyItem.setItem_transaction_id(Integer.parseInt(item_transaction_id));
		userBuyItem.setUser_master_id(Integer.parseInt(user_master_id));
		userBuyItem.setTotal_price(Integer.parseInt(total_price));
		userBuyItem.setTotal_count(Integer.parseInt(total_count));
		userBuyItem.setPay(pay);
		repository.save(userBuyItem);
	}
}