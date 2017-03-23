package com.job.entity.publics;

import java.io.Serializable;

import com.job.entity.Entity;

/**
 * @Package com.job.entity.publics
 * @ClassName AccountEntity
 * @author 刘小军
 * @date 2017年3月22日 上午12:14:38
 */
public class AccountEntity extends Entity implements Serializable {

	private static final long serialVersionUID = 2508152548090647532L;
	private String account;
	private String password;
	private String payPassword;
	private Integer status;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPayPassword() {
		return payPassword;
	}

	public void setPayPassword(String payPassword) {
		this.payPassword = payPassword;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
