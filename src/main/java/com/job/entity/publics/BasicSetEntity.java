package com.job.entity.publics;

import java.io.Serializable;

import com.job.entity.Entity;

/**
 * @Package com.job.entity.publics
 * @ClassName BasicSetEntity
 * @author 刘小军
 * @date 2017年3月22日 上午12:12:33
 */
public class BasicSetEntity extends Entity implements Serializable {

	private static final long serialVersionUID = 8872843565742251186L;

	private String k;
	private String v;
	private String note;

	public String getK() {
		return k;
	}

	public void setK(String k) {
		this.k = k;
	}

	public String getV() {
		return v;
	}

	public void setV(String v) {
		this.v = v;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}
