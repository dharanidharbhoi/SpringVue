package com.dharani.spring.starter.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dharani.entity.Topics;

@RestController
public class TopicController {

	@RequestMapping(value="/getTopics",method = RequestMethod.GET)
	public List<Topics> getTopics(){
		List<Topics> topicList = new ArrayList<>();
		topicList.add(new Topics(1, "Spring Boot", "Web Services & Micro services"));
		topicList.add(new Topics(2, "Hibernate", "HIbenate & Lazy Loading"));
		topicList.add(new Topics(3, "Monog DB", "No SQL and MonogDB"));
		topicList.add(new Topics(4, "Vue Js", "Vue JS & Node.js"));
		
		return topicList;
	}
}
 