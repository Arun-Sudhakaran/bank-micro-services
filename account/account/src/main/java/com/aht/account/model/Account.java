package com.aht.account.model;

import java.time.LocalDate;

/**
 * 
 * @author arun.sudhakaran
 *
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @ToString
@Table(name = "account")
public class Account {

	@Id
	@Column(name = "account_number")
	private long accountNumber;
	
	@Column(name = "customer_id")
	private int customerId;
	
	@Column(name = "account_type")
	private String accountType;
	
	@Column(name = "branch_address")
	private String branchAddress;
	
	@Column(name = "create_dt")
	private LocalDate createdDate;
}
