package com.bookpub;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.bookpub.repository.BookRepository;

@Order(1)
@Component
public class StartupRunner implements CommandLineRunner {

	protected final Logger logger = LoggerFactory.getLogger(StartupRunner.class);
	
	
	// http://www.jianshu.com/p/1b626a6f550e
	
	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public void run(String... args) throws Exception {
		logger.info("hello");
		logger.info("Number of Book: " + bookRepository.count());
	}

}
