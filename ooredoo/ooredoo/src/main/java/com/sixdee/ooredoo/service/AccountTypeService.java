package com.sixdee.ooredoo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sixdee.ooredoo.domain.AccountType;
import com.sixdee.ooredoo.repository.AccountTypeRepository;

@Service
public class AccountTypeService {
	
	private AccountTypeRepository repository;

	@Autowired 
	public AccountTypeService(AccountTypeRepository repository) {
		
		this.repository = repository;
	}
	
	public Iterable<AccountType> getAll() {
		
		return repository.findAll();
	}
}
