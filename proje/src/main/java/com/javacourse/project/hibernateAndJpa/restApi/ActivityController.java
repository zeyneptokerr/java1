package com.javacourse.project.hibernateAndJpa.restApi;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.javacourse.project.hibernateAndJpa.Business.IActivityService;
import com.javacourse.project.hibernateAndJpa.Entities.*;

@RestController
@RequestMapping("/api")
public class ActivityController {
	
	private IActivityService activityService;

	@Autowired
	public ActivityController(IActivityService activityService) {
		this.activityService = activityService;
	}
	
	@CrossOrigin("*")
	@GetMapping("/activities")
	public List<Activity> get(){
		return activityService.getAll();
	}
	
	@CrossOrigin("*")
	@PostMapping("/add")
	public void add(@RequestBody Activity activity) {
		activityService.add(activity);
	}
	
	@CrossOrigin("*")
	@PostMapping("/update")
	public void update(@RequestBody Activity activity) {
		activityService.update(activity);
	}
	
	@CrossOrigin("*")
	@PostMapping("/delete")
	public void delete(@RequestBody Activity activity) {
		activityService.delete(activity);
	}
	
	@CrossOrigin("*")
	@GetMapping("/activities/{id}")
	public Activity getById(@PathVariable int id){
		return activityService.getById(id);
	}
}
