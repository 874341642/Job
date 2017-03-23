package com.job.entity.publics;

import java.io.Serializable;

import com.job.entity.Entity;

/**
 * @Package com.job.entity.publics
 * @ClassName AdminEntity
 * @author 刘小军
 * @date 2017年3月22日 上午12:06:15
 */
public class AdminEntity extends Entity implements Serializable {

	private static final long serialVersionUID = 7795589521347602665L;
	private String account;
	private String password;
	private Integer type;
	private String note;

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

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}
