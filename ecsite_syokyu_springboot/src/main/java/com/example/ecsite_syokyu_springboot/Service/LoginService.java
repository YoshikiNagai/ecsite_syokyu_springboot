package com.example.ecsite_syokyu_springboot.Service;

import java.util.List;
import javax.transaction.Transactional;

import com.example.ecsite_syokyu_springboot.Entity.Login;
import com.example.ecsite_syokyu_springboot.Repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class LoginService {
 
	@Autowired
	LoginRepository repository;

	public List<Login> selectAll() {
		return repository.findAll(new Sort(Sort.Direction.ASC, "loginId"));
	}

	public Login getLoginUserInfo(String loginUserId, String loginPassword) {
		Login login = repository.findByLoginIdAndLoginPassword(loginUserId, loginPassword);
		if(login != null){
			login.setLoginFlg(true);
		}else{
			login = new Login();
		}
		return login;
	}

}