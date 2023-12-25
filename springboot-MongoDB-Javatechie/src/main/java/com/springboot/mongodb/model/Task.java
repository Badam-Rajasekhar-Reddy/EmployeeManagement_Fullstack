package com.springboot.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Document(collection = "tasks")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {
	
	@Id
	private String taskId;
	private String description;
	private int severity;
	private String assigne;
	private int storyPoint;
	
	
	public Task(String taskId, String description, int severity, String assigne, int storyPoint) {
		super();
		this.taskId = taskId;
		this.description = description;
		this.severity = severity;
		this.assigne = assigne;
		this.storyPoint = storyPoint;
	}
	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", description=" + description + ", severity=" + severity + ", assigne="
				+ assigne + ", storyPoint=" + storyPoint + "]";
	}
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getSeverity() {
		return severity;
	}
	public void setSeverity(int severity) {
		this.severity = severity;
	}
	public String getAssigne() {
		return assigne;
	}
	public void setAssigne(String assigne) {
		this.assigne = assigne;
	}
	public int getStoryPoint() {
		return storyPoint;
	}
	public void setStoryPoint(int storyPoint) {
		this.storyPoint = storyPoint;
	}

}
