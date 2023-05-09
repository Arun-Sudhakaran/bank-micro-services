package com.sixdee.ooredoo.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.sixdee.ooredoo.domain.CardSalesSummaryMonthly;

/**
 * 
 * @author arun.sudhakaran
 * @Date : 28/10/2022
 */

@Repository
public interface CardSalesSummaryMonthlyRepository 
				extends PagingAndSortingRepository<CardSalesSummaryMonthly, Integer>, JpaSpecificationExecutor<CardSalesSummaryMonthly> {

}
