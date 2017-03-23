package com.job.dao.base;

import java.util.List;

import com.job.entity.Entity;

public interface BaseDao {
	public Entity getById(Long id);
	public List<Entity> getAll();
	public void insert(Entity entity);
	public void delete(Entity entity);
	public void update(Entity entity);
}
