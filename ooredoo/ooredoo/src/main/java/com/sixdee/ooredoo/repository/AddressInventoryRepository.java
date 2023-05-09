package com.sixdee.ooredoo.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.sixdee.ooredoo.domain.AddressInventory;

/**
 * 
 * @author arun.sudhakaran
 * @Date : 28/10/2022
 */

public interface AddressInventoryRepository 
				extends PagingAndSortingRepository<AddressInventory, Integer>, JpaSpecificationExecutor<AddressInventory> {

}
