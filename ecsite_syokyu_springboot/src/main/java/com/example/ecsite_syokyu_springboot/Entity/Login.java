package com.example.ecsite_syokyu_springboot.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="login_user_transaction")
public class Login {
	 
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name="loginId")
	private String loginId;
	 
	@Column(name="loginPassword")
	private String loginPassword;
 
	@Column(name="userName")
    private String userName;
    
    @Column(name="loginFlg")
    private boolean loginFlg;

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean getLoginFlg() {
        return loginFlg;
    }

    public void setLoginFlg(boolean loginFlg) {
        this.loginFlg = loginFlg;
    }
}