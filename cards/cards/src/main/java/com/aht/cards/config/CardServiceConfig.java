package com.aht.cards.config;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author arun.sudhakaran
 *
 */

@Configuration
@ConfigurationProperties(prefix = "cards")
@Getter @Setter
public class CardServiceConfig {

	private String msg;
	private String buildVersion;
	private Map<String, String> mailDetails;
	private List<String> activeBranches;
}
