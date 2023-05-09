package com.sixdee.ooredoo.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.sixdee.ooredoo.domain.BulkTopupFileSummary;

/**
 * 
 * @author arun.sudhakaran
 * @Date : 28/10/2022
 */

@Repository
public interface BulkTopupFileSummaryRepository 
				extends PagingAndSortingRepository<BulkTopupFileSummary, Integer>, JpaSpecificationExecutor<BulkTopupFileSummary> {

}
