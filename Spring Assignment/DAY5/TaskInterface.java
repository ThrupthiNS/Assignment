package com.example.demo;
import java.util.*;

public interface TaskInterface {
	//public Task getTask(int id);
	public List<Task> getAllTasks();
	public List<Task> printTask(int t);
	
	public int setPriority(int taskid);
	
	public int addTask(Task u);
	
	public int addNotes(int taskid,String notes,String book);
	
	
}
