package com.example.ecsite_syokyu_springboot.Repository;

import com.example.ecsite_syokyu_springboot.Entity.BuyItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuyItemRepository extends JpaRepository<BuyItem, Integer> {
    
}