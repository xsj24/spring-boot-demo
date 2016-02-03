package com.bookpub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableAutoConfiguration
@ComponentScan(value={"hello", "com.bookpub"})
@EntityScan("com.bookpub.domain")
@EnableJpaRepositories("com.bookpub.repository")  
public class BookpubApplication {
	
//	@Bean
//	public StartupRunner schedulerRunner() {
//		return new StartupRunner();
//	}
	
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(BookpubApplication.class);
		app.setShowBanner(false);
		ApplicationContext ctx = app.run(args);
		
		/*System.out.println("Let's inspect the beans provided by Spring Boot:");
		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for (String name : beanNames) {
			System.out.println(name);
		}*/
		
	}
}
