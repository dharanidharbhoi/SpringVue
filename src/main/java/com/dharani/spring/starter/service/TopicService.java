package com.dharani.spring.starter.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dharani.entity.Topics;

@Service
public class TopicService {

	List<Topics> topicList = Arrays.asList(new Topics(1, "Spring Boot", "Web Services & Micro services"),
			new Topics(2, "Hibernate", "HIbenate & Lazy Loading"), new Topics(3, "Monog DB", "No SQL and MonogDB"),
			new Topics(4, "Vue Js", "Vue JS & Node.js"));

	public List<Topics> getTopics() {

		return topicList;
	}
	
	public Topics getTopicsById(int id) {
		return topicList.stream().filter(t -> id == t.getId()).findFirst().get();
	}

}
