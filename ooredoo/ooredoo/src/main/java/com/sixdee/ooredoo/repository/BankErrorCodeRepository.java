package com.sixdee.ooredoo.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.sixdee.ooredoo.domain.BankErrorCode;

/**
 * 
 * @author arun.sudhakaran
 * @Date : 28/10/2022
 */

@Repository
public interface BankErrorCodeRepository 
				extends PagingAndSortingRepository<BankErrorCode, Integer>, JpaSpecificationExecutor<BankErrorCode> {
}
