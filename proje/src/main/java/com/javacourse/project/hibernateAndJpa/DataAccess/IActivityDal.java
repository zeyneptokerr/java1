package com.javacourse.project.hibernateAndJpa.DataAccess;
import com.javacourse.project.hibernateAndJpa.Entities.Activity;
import java.util.List;

public interface IActivityDal {
	List<Activity> getAll();
	void add(Activity activity);
	void update(Activity activity);
	void delete(Activity activity);
	Activity getById(int id);
}
