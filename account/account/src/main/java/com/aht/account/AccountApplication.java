package com.aht.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import io.micrometer.core.aop.TimedAspect;
import io.micrometer.core.instrument.MeterRegistry;

@SpringBootApplication
@RefreshScope
@ComponentScans({@ComponentScan("com.aht.account.controller")})
@EnableJpaRepositories("com.aht.account.repository")
@EntityScan("com.aht.account.model")
@EnableFeignClients("com.aht.account.service.client")
public class AccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountApplication.class, args);
	}

	/**
	 * 
	 * Get time consumed by this service
	 */
	@Bean
	public TimedAspect timedAspect(MeterRegistry registry) {
		
		return new TimedAspect(registry);
	}
}
