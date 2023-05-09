package com.aht.cards.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.aht.cards.model.Card;

/**
 * 
 * @author arun.sudhakaran
 *
 */

public interface CardsRepository extends CrudRepository<Card, Integer> {

	List<Card> findByCustomerId(int customerId);
}
