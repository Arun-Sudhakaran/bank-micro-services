package com.sixdee.ooredoo.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.sixdee.ooredoo.domain.BulkTopupFileDetail;

@Repository
public interface BulkTopupFileDetailRepository 
				extends PagingAndSortingRepository<BulkTopupFileDetail, Integer>, JpaSpecificationExecutor<BulkTopupFileDetail> {

}
