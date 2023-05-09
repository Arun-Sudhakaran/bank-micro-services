package com.aht.account.service.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aht.account.model.Cards;
import com.aht.account.model.Customer;

@FeignClient("cards")
public interface CardsFeignClient {

	@RequestMapping(method = RequestMethod.POST, value = "find-cards", consumes = MediaType.APPLICATION_JSON_VALUE)
	List<Cards> getCardDetails(@RequestBody Customer customer);
}
