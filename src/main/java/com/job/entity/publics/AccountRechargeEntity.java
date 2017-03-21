package com.job.entity.publics;

import java.io.Serializable;

import com.job.entity.Entity;

/**
 * @Package com.job.entity.publics
 * @ClassName AccountRechargeEntity
 * @author 刘小军
 * @date 2017年3月22日 上午12:19:07
 */
public class AccountRechargeEntity extends Entity implements Serializable {

	private static final long serialVersionUID = -5669725855759098093L;
	private Long account_id;
	private Float money;
	private Integer way;

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

}
