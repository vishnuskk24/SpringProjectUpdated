package com.infy.util;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class Mailer {

	@Autowired
	Environment environment;
	
	  @Bean
	    public JavaMailSender javaMailSender() {
		  JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
	        mailSender.setHost("smtp.gmail.com");
	        mailSender.setPort(587);
	        mailSender.setUsername("vishnuskk24");
	        mailSender.setPassword("lwqd eugg ykja tjhu");

	        Properties props = mailSender.getJavaMailProperties();
	        props.put("mail.transport.protocol", "smtp");
	        props.put("mail.smtp.auth", "true");
	        props.put("mail.smtp.starttls.enable", "true");
	        props.put("mail.smtp.starttls.required", "true");
	        props.put("mail.smtp.connectiontimeout", "5000");
	        props.put("mail.smtp.timeout", "5000");
	        props.put("mail.smtp.writetimeout", "5000");
	        return mailSender;
	    }
}
