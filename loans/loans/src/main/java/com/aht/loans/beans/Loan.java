package com.aht.loans.beans;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 
 * @author arun.sudhakaran
 *
 */

@Entity
@Getter @Setter @ToString
@Table(name = "loans")
public class Loan {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "loan_number")
	private long loanNumber;
	
	@Column(name = "customer_id")
	private int customerId;
	
	@Column(name = "start_dt")
	private Date startDate;
	
	@Column(name = "loan_type")
	private String loanType;
	
	@Column(name = "total_loan")
	private int totalLoan;
	
	@Column(name = "amount_paid")
	private int amountPaid;
	
	@Column(name = "outstanding_amount")
	private int outstandingAmount;

	@Column(name = "create_dt")
	private String createdDate;
}
