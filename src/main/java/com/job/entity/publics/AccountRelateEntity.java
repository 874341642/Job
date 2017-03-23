package com.job.entity.publics;

import java.io.Serializable;

import com.job.entity.Entity;

/**
 * @Package com.job.entity.publics
 * @ClassName AccountRelateEntity
 * @author 刘小军
 * @date 2017年3月22日 上午12:16:52
 */
public class AccountRelateEntity extends Entity implements Serializable {

	private static final long serialVersionUID = 2794361189062343343L;
	private Long account_id;
	private String account;
	private Long first_id;
	private Long second_id;
	private Long thirdly_id;

	public Long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(Long account_id) {
		this.account_id = account_id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public Long getFirst_id() {
		return first_id;
	}

	public void setFirst_id(Long first_id) {
		this.first_id = first_id;
	}

	public Long getSecond_id() {
		return second_id;
	}

	public void setSecond_id(Long second_id) {
		this.second_id = second_id;
	}

	public Long getThirdly_id() {
		return thirdly_id;
	}

	public void setThirdly_id(Long thirdly_id) {
		this.thirdly_id = thirdly_id;
	}

}
