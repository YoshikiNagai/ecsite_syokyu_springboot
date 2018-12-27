package com.example.ecsite_syokyu_springboot.Service;

import javax.transaction.Transactional;

import com.example.ecsite_syokyu_springboot.Entity.Login;
import com.example.ecsite_syokyu_springboot.Repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {
 
	@Autowired
	LoginRepository repository;

	public Login createUser(String loginUserId, String loginPassword, String userName) {
		Login login = new Login();
		login.setLoginId(loginUserId);
		login.setLoginPassword(loginPassword);
		login.setUserName(userName);
		return repository.save(login);
	}

}