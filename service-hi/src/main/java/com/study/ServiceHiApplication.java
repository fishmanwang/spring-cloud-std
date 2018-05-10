package com.study;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@SpringBootApplication
public class ServiceHiApplication {

	private static final Logger logger = LoggerFactory.getLogger(ServiceHiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ServiceHiApplication.class, args);
	}

	@Autowired
	private RestTemplate restTemplate;

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@RequestMapping("/hi")
	public String callHome() {
		logger.info("calling trace service-hi ");
		return restTemplate.getForObject("http://localhost:8766/miya", String.class);
	}

	@RequestMapping("/info")
	public String info() {
		logger.info("calling trace service-hi ");
		return "I'm service-hi";
	}

//	@Bean
//	public AlwaysSampler defaultSamler() {
//		return new AlwaysSampler();
//	}

}
