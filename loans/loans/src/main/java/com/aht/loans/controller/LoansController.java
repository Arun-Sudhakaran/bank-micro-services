package com.aht.loans.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aht.loans.beans.Properties;
import com.aht.loans.LoansServiceConfig;
import com.aht.loans.beans.Customer;
import com.aht.loans.beans.Loan;
import com.aht.loans.repository.LoansRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

/**
 * 
 * @author arun.sudhakaran
 *
 */

@RestController
public class LoansController {

	private static final Logger LOG = LoggerFactory.getLogger(LoansController.class); 
	
	@Autowired
	private LoansRepository loansRepository;
	
	@Autowired
	private LoansServiceConfig loansServiceConfig;
	
	@PostMapping(path = "find-loans")
	public List<Loan> getCustomerLoans(@RequestBody Customer customer) {
		
		LOG.info("Inside get customer loans method");
		
		return loansRepository.findByCustomerIdOrderByStartDateDesc(customer.getCustomerId());
	}
	
	@GetMapping(value = "/loan/properties")
	public String getPropertyDetails() throws JsonProcessingException {
		
		ObjectWriter ow = new ObjectMapper().writerWithDefaultPrettyPrinter();
		
		com.aht.loans.beans.Properties properties = new Properties(loansServiceConfig.getMsg(), loansServiceConfig.getBuildVersion(), 
				loansServiceConfig.getMailDetails(), loansServiceConfig.getActiveBranches());
		
		return ow.writeValueAsString(properties);
	}
}
