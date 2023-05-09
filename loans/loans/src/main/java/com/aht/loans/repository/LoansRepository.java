package com.aht.loans.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.aht.loans.beans.Loan;

/**
 * 
 * @author arun.sudhakaran
 *
 */

public interface LoansRepository extends CrudRepository<Loan, Long> {

	List<Loan> findByCustomerIdOrderByStartDateDesc(int customerId);
}
