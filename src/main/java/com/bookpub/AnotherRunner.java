package com.bookpub;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Component
public class AnotherRunner implements CommandLineRunner {

	protected final Logger logger = LoggerFactory.getLogger(AnotherRunner.class);
	
	@Override
	public void run(String... args) throws Exception {
		logger.info("另一个启动器");
	}

}
