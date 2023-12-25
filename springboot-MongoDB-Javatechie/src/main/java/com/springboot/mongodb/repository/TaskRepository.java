package com.springboot.mongodb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.springboot.mongodb.model.Task;

public interface TaskRepository extends MongoRepository<Task,String> {

	List<Task> findBySeverity(int severity);
	
//	@Query("{assigne:?0, fieldName : ?1}")
	@Query("{assigne:?0}")
	List<Task> getTaskByAssigne(String assignee);

}
