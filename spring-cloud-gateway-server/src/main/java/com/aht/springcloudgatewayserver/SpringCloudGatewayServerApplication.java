package com.aht.springcloudgatewayserver;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudGatewayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudGatewayServerApplication.class, args);
	}

	@Bean
	public RouteLocator myRoutes(RouteLocatorBuilder builder) {
	    return builder.routes()
	        .route(p -> p
	            .path("/aht/accounts/**")
	            .filters(f -> f.rewritePath("/aht/accounts/(?<segment>.*)","/${segment}")
	            				.addResponseHeader("X-Response-Time", new Date().toString()))
	            .uri("lb://ACCOUNTS")).
	        route(p -> p
		            .path("/aht/loans/**")
		            .filters(f -> f.rewritePath("/aht/loans/(?<segment>.*)","/${segment}")
		            		.addResponseHeader("X-Response-Time", new Date().toString()))
		            .uri("lb://LOANS")).
	        route(p -> p
		            .path("/aht/cards/**")
		            .filters(f -> f.rewritePath("/aht/cards/(?<segment>.*)","/${segment}")
		            		.addResponseHeader("X-Response-Time", new Date().toString()))
		            .uri("lb://CARDS")).build();
	}
}
