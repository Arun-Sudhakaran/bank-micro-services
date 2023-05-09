package com.sixdee.ooredoo.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author arun.sudhakaran
 * @Date : 28/10/2022
 */

@Entity
@Getter @Setter
@Table(name = "ETP_BULK_RECHARGE_FILE_DETAILS")
public class BulkRechargeFileDetail implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	
	@Column(name = "FILE_ID")
	private int fileId;
	
	@Column(name = "MOBILE_NUMBER")
	private String mobileNumber;
	
	@Column(name = "AMOUNT")
	private double amount;

	@Column(name = "PRODUCT_ID")
	private String productId;
	
	@Column(name = "DEALER_CODE")
	private String dealerCode;
	
	@Column(name = "EXT_TRANSACTION_ID")
	private String extTransactionId;
	
	@Column(name = "BL_TRANSACTION_ID")
	private String blTransactionId;
	
	@Column(name = "STATUS_CODE")
	private String statusCode;
	
	@Column(name = "STATUS_DESC")
	private String statusDesc;
	
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATED_DATE", updatable = false)
	private Date updatedDate;
	
	@Column(name = "ACCOUNT_TYPE")
	private String accountType;
}
