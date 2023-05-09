package com.sixdee.ooredoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScans({@ComponentScan("com.sixdee.ooredoo.controller"), @ComponentScan("com.sixdee.ooredoo.service")})
@EnableJpaRepositories("com.sixdee.ooredoo.repository")
@EntityScan("com.sixdee.ooredoo.domain")
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class OoredooApplication {

	public static void main(String[] args) {
		SpringApplication.run(OoredooApplication.class, args);
	}

}
