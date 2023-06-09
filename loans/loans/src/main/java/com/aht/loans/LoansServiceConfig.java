package com.aht.loans;

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
@ConfigurationProperties(prefix = "loans")
@Getter @Setter
public class LoansServiceConfig {

	private String msg;
	private String buildVersion;
	private Map<String, String> mailDetails;
	private List<String> activeBranches;
}
