package com.dharani.spring.starter.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dharani.entity.Topics;

@Service
public class TopicService {
	
	public List<Topics> getTopics(){
		List<Topics> topicList = new ArrayList<>();
		topicList.add(new Topics(1, "Spring Boot", "Web Services & Micro services"));
		topicList.add(new Topics(2, "Hibernate", "HIbenate & Lazy Loading"));
		topicList.add(new Topics(3, "Monog DB", "No SQL and MonogDB"));
		topicList.add(new Topics(4, "Vue Js", "Vue JS & Node.js"));
		
		return topicList;
	}

}
