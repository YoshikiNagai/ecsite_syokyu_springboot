package com.example.ecsite_syokyu_springboot.Service;

import java.util.List;
import javax.transaction.Transactional;

import com.example.ecsite_syokyu_springboot.Entity.BuyItem;
import com.example.ecsite_syokyu_springboot.Repository.BuyItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class BuyItemService {
 
	@Autowired
	BuyItemRepository repository;

	public List<BuyItem> selectAll() {
		return repository.findAll(new Sort(Sort.Direction.ASC, "id"));
	}

	public BuyItem getBuyItemInfo() {
		return repository.findAll().get(0);
	}
}