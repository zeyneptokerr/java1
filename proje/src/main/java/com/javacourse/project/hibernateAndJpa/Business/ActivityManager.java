package com.javacourse.project.hibernateAndJpa.Business;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.javacourse.project.hibernateAndJpa.DataAccess.IActivityDal;
import com.javacourse.project.hibernateAndJpa.Entities.Activity;

@Service
public class ActivityManager implements IActivityService {

	private IActivityDal activityDal;
	
	@Autowired
	public ActivityManager(IActivityDal activityDal) {
		super();
		this.activityDal = activityDal;
	}

	@Override
	@Transactional
	public List<Activity> getAll() {
		return this.activityDal.getAll();
	}

	@Override
	@Transactional
	public void add(Activity activity) {
		this.activityDal.add(activity);
	}

	@Override
	@Transactional
	public void update(Activity activity) {
		this.activityDal.update(activity);
	}

	@Override
	@Transactional
	public void delete(Activity activity) {
		this.activityDal.delete(activity);
	}

	@Override
	@Transactional
	public Activity getById(int id) {
		return this.activityDal.getById(id);
	}

}
