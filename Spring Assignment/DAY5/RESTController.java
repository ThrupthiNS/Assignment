package com.example.demo;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTController {
	
	@Autowired
	TaskInterface task;
	//@GetMapping(value = "/task")

	@RequestMapping(value = "/task", method = RequestMethod.GET,produces = {"application/json","application/xml"})
	public List<Task> getTask() {
		return task.getAllTasks();
		
	}
	
	//set priority code
	
//	@RequestMapping(value = "/task1", method = RequestMethod.GET,produces = {"application/json","application/xml"})
//	public int setPriority() {
//		return task.setPriority(100);
//	}
	
	//add notes and bookmark
	
	@RequestMapping(value ="/taskid/{taskid}/notes/{notes}/isBookmarked/{book}",method = RequestMethod.GET,produces = {"application/json","application/xml"})
	public List<Task> printTask(@PathVariable int taskid, @PathVariable String notes,@PathVariable String book, Model model) {
	model.addAttribute("notes",notes );
	model.addAttribute("taskid", taskid);
	model.addAttribute("isBookmarked", book);
	int row=task.addNotes(taskid,notes,book);
	return task.printTask(taskid);
	}
	
	@PostMapping(value= "/tasks", consumes = "application/json", produces = "application/json")
	public Task addTask(@RequestBody Task t) throws Exception
	{
	task.addTask(t);
	return t;

	}
	
}
