package com.dharani.spring.starter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dharani.entity.Topics;
import com.dharani.spring.starter.service.TopicService;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;

	@GetMapping(path = "/getTopics")
	public List<Topics> getTopics() {

		return topicService.getTopics();
	}
}
