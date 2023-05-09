package com.aht.account.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aht.account.model.Account;

/**
 * 
 * @author arun.sudhakaran
 *
 */

@Repository
public interface AccountsRepository extends CrudRepository<Account, Long>{

	Optional<Account> findByCustomerId(int cutomerId);
}