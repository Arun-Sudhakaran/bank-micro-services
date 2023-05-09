package com.aht.account.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aht.account.config.AccountServiceConfig;
import com.aht.account.model.Account;
import com.aht.account.model.Cards;
import com.aht.account.model.Customer;
import com.aht.account.model.CustomerDetails;
import com.aht.account.model.Loans;
import com.aht.account.model.Properties;
import com.aht.account.repository.AccountsRepository;
import com.aht.account.service.client.CardsFeignClient;
import com.aht.account.service.client.LoansFeignClient;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.micrometer.core.annotation.Timed;

/**
 * 
 * @author arun.sudhakaran
 *
 */

@RestController
public class AccountsController {

	private static final Logger LOG = LoggerFactory.getLogger(AccountsController.class);
	
	@Autowired
	private AccountsRepository accountsRepository;

	@Autowired
	private AccountServiceConfig accountServiceConfig;

	@Autowired
	private LoansFeignClient loansFeignClient;

	@Autowired
	private CardsFeignClient cardsFeignClient;

	@PostMapping(value = "/find-account")
	@Timed(value = "findAccount.time", description = "Time taken to fetch Account details")
	public Account findAccount(@RequestBody Customer customer) {

		Optional<Account> accountOp = accountsRepository.findByCustomerId(customer.getCustomerId());

		if(accountOp.isPresent())
			return accountOp.get();

		return null;
	}

	@GetMapping(value = "/account/properties")
	public String getPropertyDetails() throws JsonProcessingException {

		ObjectWriter ow = new ObjectMapper().writerWithDefaultPrettyPrinter();

		Properties properties = new Properties(accountServiceConfig.getMsg(), accountServiceConfig.getBuildVersion(), 
				accountServiceConfig.getMailDetails(), accountServiceConfig.getActiveBranches());

		return ow.writeValueAsString(properties);
	}

	@PostMapping(value = "/get-customer-details")
	@CircuitBreaker(name = "detailsForCustomerSupportApp")
	public CustomerDetails findDetailsForCustomerSupportApp(@RequestBody Customer customer) {

		LOG.info("Inside customer details");
		
		Account accounts = accountsRepository.findByCustomerId(customer.getCustomerId()).orElse(null);
		List<Loans> loans = loansFeignClient.getLoansDetails(customer);
		List<Cards> cards = cardsFeignClient.getCardDetails(customer);

		CustomerDetails customerDetails = new CustomerDetails();
		customerDetails.setAccount(accounts);
		customerDetails.setLoans(loans);
		customerDetails.setCards(cards);
		
		LOG.info("Customer details fetched");

		return customerDetails;
	}
}
