package com.job.entity.publics;

import java.io.Serializable;

import com.job.entity.Entity;

/**
 * @Package com.job.entity.publics
 * @ClassName AdminLogEntity
 * @author 刘小军
 * @date 2017年3月22日 上午12:10:22
 */
public class AdminLogEntity extends Entity implements Serializable {

	private static final long serialVersionUID = -7454521816072110477L;

	private String ip;
	private String info;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

}
