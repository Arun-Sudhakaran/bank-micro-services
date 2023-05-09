package com.sixdee.ooredoo.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
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
@Table(name = "ETP_CORPORATE_TOPUP")
public class CorporateTopup implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "EMP_ID")
	private String empId;
	
	@Column(name = "MSISDN")
	private String msisdn;
	
	@Column(name = "CORPORATE_ID")
	private String corporateId;
	
	@Column(name = "TOPUP_AMOUNT")
	private double topupAmount;
	
	@Column(name = "TOPUP_INTERVAL")
	private int topupInterval;
	
	@Column(name = "PREVIOUS_TOPUP_DATE")
	private Date previousTopupDate;
	
	@Column(name = "NEXT_TOPUP_DATE")
	private Date nextTopupDate;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED_DATE", updatable = false)
	private Date createdDate;
	
	@Column(name = "CREATED_USER")
	private String createdUser;
	
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATED_DATE", updatable = false)
	private Date updatedDate;

	@Column(name = "UPDATED_USER")
	private String updatedUser;
	
	@Column(name = "SERVER_NAME")
	private Date serverName;
	
	@Column(name = "EXPIRY_DATE")
	private Date expiryDate;
}
