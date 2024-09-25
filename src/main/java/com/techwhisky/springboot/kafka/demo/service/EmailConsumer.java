package com.techwhisky.springboot.kafka.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.techwhisky.springboot.kafka.demo.model.Email;




@Service
public class EmailConsumer {
	
	private Logger logger=LoggerFactory.getLogger(EmailConsumer.class);
	
	@KafkaListener(topics= {"email"},groupId = "email-consumers")
	public void consumeEmailsAndProcess1(Email message) {
		logger.info("received message from kafka 1:"+message);
	}
	
	/*@KafkaListener(topics= {"email"},groupId = "email-consumers")
	public void consumeEmailsAndProcess2(String message) {
		logger.info("received message from kafka 2:"+message);
	}
	
	@KafkaListener(topics= {"email"},groupId = "email-consumers")
	public void consumeEmailsAndProcess3(String message) {
		logger.info("received message from kafka 3:"+message);
	}*/

}
