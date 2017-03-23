package com.job.entity.publics;

import java.io.Serializable;
import java.sql.Blob;

import com.job.entity.Entity;

/**
 * @Package com.job.entity.publics
 * @ClassName TradeEntity
 * @author 刘小军
 * @date 2017年3月21日 下午11:56:18
 */
public class TradeEntity extends Entity implements Serializable {

	private static final long serialVersionUID = -2172480087876631176L;

	private Integer parent_id;
	private String path;
	private String name;
	private Blob images;
	private Integer sortid;
	private Integer type;
	private Integer level;
	private Integer visible;
	private String certificate;
	private String note;

	public Integer getParent_id() {
		return parent_id;
	}

	public void setParent_id(Integer parent_id) {
		this.parent_id = parent_id;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Blob getImages() {
		return images;
	}

	public void setImages(Blob images) {
		this.images = images;
	}

	public Integer getSortid() {
		return sortid;
	}

	public void setSortid(Integer sortid) {
		this.sortid = sortid;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getVisible() {
		return visible;
	}

	public void setVisible(Integer visible) {
		this.visible = visible;
	}

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}
