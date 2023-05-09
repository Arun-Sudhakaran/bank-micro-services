package com.sixdee.ooredoo.service;

import org.springframework.stereotype.Service;

import com.sixdee.etopup.accounts.service.model.CustomValidationService;
import com.sixdee.ooredoo.domain.SwiggyCrudEntity;
import com.sixdee.ooredoo.mapper.SwiggyCrudMapper;
import com.sixdee.ooredoo.repository.SwiggyCrudRepository;
import com.sixdee.ooredoo.request.SwiggyCrudRequest;
import com.sixdee.ooredoo.response.SwiggyCrudResponse;

import io.github.cepr0.crud.service.AbstractCrudService;

/**
 * 
 * @author arun.sudhakaran
 *
 * Date 18/11/2022
 */

@Service
public class SwiggyCrudService implements CustomValidationService/* extends AbstractCrudService<SwiggyCrudEntity, Integer, SwiggyCrudRequest, SwiggyCrudResponse>*/ {

	@Override
	public void doExecute() {
		// TODO Auto-generated method stub
		
	}
	
//	public SwiggyCrudService(SwiggyCrudRepository repo, SwiggyCrudMapper mapper) {
//		
//        super(repo, mapper);
//    }
}
