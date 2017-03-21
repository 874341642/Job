package com.job.entity.publics;

import java.io.Serializable;
import java.sql.Timestamp;

import com.job.entity.Entity;

/**
 * @Package com.job.entity.publics
 * @ClassName AccountCashEntity
 * @author 刘小军
 * @date 2017年3月22日 上午12:23:53
 */
public class AccountCashEntity extends Entity implements Serializable {

	private static final long serialVersionUID = -9032621369376705870L;
	private Long account_id;
	private Float money;
	private Integer way;
	private Integer status;
	private String statusNote;
	private Timestamp mdate;

	public Long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(Long account_id) {
		this.account_id = account_id;
	}

	public Float getMoney() {
		return money;
	}

	public void setMoney(Float money) {
		this.money = money;
	}

	public Integer getWay() {
		return way;
	}

	public void setWay(Integer way) {
		this.way = way;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getStatusNote() {
		return statusNote;
	}

	public void setStatusNote(String statusNote) {
		this.statusNote = statusNote;
	}

	public Timestamp getMdate() {
		return mdate;
	}

	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
	}

}
