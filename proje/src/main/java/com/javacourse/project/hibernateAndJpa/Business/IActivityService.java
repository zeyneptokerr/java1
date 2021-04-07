package com.javacourse.project.hibernateAndJpa.Business;

import java.util.List;

import com.javacourse.project.hibernateAndJpa.Entities.Activity;

public interface IActivityService {
	List<Activity> getAll();
	void add(Activity activity);
	void update(Activity activity);
	void delete(Activity activity);
	Activity getById(int id);
}
