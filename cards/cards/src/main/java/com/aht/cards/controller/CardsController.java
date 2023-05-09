package com.aht.cards.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aht.cards.config.CardServiceConfig;
import com.aht.cards.model.Card;
import com.aht.cards.model.Properties;
import com.aht.cards.repository.CardsRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

/**
 * 
 * @author arun.sudhakaran
 *
 */

@RestController
public class CardsController {
	
	private static final Logger LOG = LoggerFactory.getLogger(CardsController.class);

	@Autowired
	private CardsRepository cardsRepository;
	
	@Autowired
	private CardServiceConfig cardServiceConfig;
	
	@PostMapping(path = "find-cards")
	public List<Card> getAllCustomerCards(@RequestBody Card card) {
		
		LOG.info("Inside get customer cards method");
		
		return cardsRepository.findByCustomerId(card.getCustomerId());
	}
	
	@GetMapping(value = "/card/properties")
	public String getPropertyDetails() throws JsonProcessingException {
		
		ObjectWriter ow = new ObjectMapper().writerWithDefaultPrettyPrinter();
		
		Properties properties = new Properties(cardServiceConfig.getMsg(), cardServiceConfig.getBuildVersion(), 
				cardServiceConfig.getMailDetails(), cardServiceConfig.getActiveBranches());
		
		return ow.writeValueAsString(properties);
	}
}
