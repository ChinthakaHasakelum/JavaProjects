package com.krishantha.eventManager.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.krishantha.eventManager.model.Event;

@Repository("eventRepository")
public class EventRepositoryImpl implements EventRepository {

	@PersistenceContext
	EntityManager entityManager;
	
	
	public Event save(Event event) {
		entityManager.persist(event);
		entityManager.flush();
		return event;
	}


	public List<Event> getAllEvents() {
		Query query= entityManager.createQuery("select e from Event e");
		List <Event> eventlist=query.getResultList();
		
		for(Event event:eventlist){
			
			System.out.println("testdata: "+event.getId()+event.getEventName());
		}
		
		
		System.out.println("Records"+eventlist.size());
		return eventlist;
	}

}
