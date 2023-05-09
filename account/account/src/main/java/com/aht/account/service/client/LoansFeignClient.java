package com.aht.account.service.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aht.account.model.Customer;
import com.aht.account.model.Loans;

@FeignClient("loans")
public interface LoansFeignClient {

	@RequestMapping(method = RequestMethod.POST, value = "find-loans", consumes = MediaType.APPLICATION_JSON_VALUE)
	List<Loans> getLoansDetails(@RequestBody Customer customer);
}
