package com.javacourse.project.hibernateAndJpa.DataAccess;
import com.javacourse.project.hibernateAndJpa.Entities.Activity;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class HibernateActivityDal implements IActivityDal{

	private EntityManager entityManager;
	
	@Autowired
	public HibernateActivityDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<Activity> getAll() {
		Session session = entityManager.unwrap(Session.class);
		List<Activity> activities = session.createQuery("from Activity", Activity.class).getResultList();
		return activities;
	}

	@Override
	public void add(Activity activity) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(activity);
	}

	@Override
	public void update(Activity activity) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(activity);
	}

	@Override
	public void delete(Activity activity) {
		Session session = entityManager.unwrap(Session.class);
		Activity activityToDelete =  session.get(Activity.class, activity.getId());
		session.delete(activityToDelete);
	}

	@Override
	public Activity getById(int id) {
		Session session = entityManager.unwrap(Session.class);
		
		Activity activity =  session.get(Activity.class, id);
		return activity;
	}

}
