package com.krishantha.eventManager.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;



@Entity
public class Event {

	@Id
	@GeneratedValue
	
	private Long id;
	
	@Size(min=5, max=100, message="Event name should between 5 and 10 characters")
	private String eventName;
	
	String eventType;
	@OneToMany(mappedBy="event",cascade={CascadeType.ALL},fetch=FetchType.EAGER)
	List <Activity> activities=new ArrayList<Activity>();

	public String getEventType() {
		return eventType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Activity> getActivities() {
		return activities;
	}

	public void setActivities(List<Activity> activities) {
		this.activities = activities;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	
	
}
