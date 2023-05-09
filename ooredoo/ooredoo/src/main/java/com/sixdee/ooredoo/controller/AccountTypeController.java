package com.sixdee.ooredoo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sixdee.ooredoo.domain.AccountType;
import com.sixdee.ooredoo.service.AccountTypeService;

@RestController
@RequestMapping("swiggy-crud-test")
public class AccountTypeController {

	@Autowired
	private AccountTypeService accountTypeService;
	
	public Iterable<AccountType> findAll() {
		
		return accountTypeService.getAll();
	}
}
