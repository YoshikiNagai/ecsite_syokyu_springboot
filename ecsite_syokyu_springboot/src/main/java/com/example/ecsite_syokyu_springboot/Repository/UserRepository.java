package com.example.ecsite_syokyu_springboot.Repository;

import com.example.ecsite_syokyu_springboot.Entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Login, Integer> {

}