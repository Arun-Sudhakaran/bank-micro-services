package com.sixdee.ooredoo.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author arun.sudhakaran
 * @Date : 28/10/2022
 */

@Entity
@Getter @Setter
@Table(name = "ETP_DEALER_UPLOAD_FILE_DETAILS")
public class DealerUploadFileDetail implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	
	@Column(name = "FILE_ID")
	private String fileId;
	
	@Column(name = "USER_ID")
	private String userid;
	
	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@Column(name = "USER_NAME")
	private String userName;
	
	@Column(name = "STATUS")
	private int status;

	@Column(name = "EMAIL_ID")
	private String emailId;
	
	@Column(name = "MSISDN")
	private String msisdn;
	
	@Column(name = "ALTERNATE_CONTACT_NO")
	private String alternateContactNo;
	
	@Column(name = "LANGUAGE")
	private String language;
	
	@Column(name = "USER_TYPE")
	private String userType;
	
	@Column(name = "WALLET_TYPE")
	private String walletType;

	@Column(name = "AREA_ID")
	private int areaId;
	
	@Column(name = "LEVEL_ID")
	private int levelId;
	
	@Column(name = "PROFILE_ID")
	private int profileId;

	@Column(name = "ADDRESS_LINE1")
	private String addressLine1;
	
	@Column(name = "ADDRESS_LINE2")
	private String addressLine2;
	
	@Column(name = "STATE")
	private String state;
	
	@Column(name = "CITY")
	private String city;
	
	@Column(name = "LOCALITY")
	private String locality;
	
	@Column(name = "ZIP")
	private String zip;
	
	@Column(name = "ACCOUNT_TYPE_1")
	private int accountType1;
	
	@Column(name = "DAILY_LIMIT_1")
	private double dailyLimit1;
	
	@Column(name = "WEEKLY_LIMIT_1")
	private double weeklyLimit1;
	
	@Column(name = "MONTHLY_LIMIT_1")
	private double monthlyLimit1;
	
	@Column(name = "UPLOAD_STATUS")
	private int uploadStatus;

	@Column(name = "ERP_CODE")
	private String erpCode;
	
	@Column(name = "PARENT")
	private String parent;
	
	@Column(name = "SALESMAN_CODE")
	private String salesmanCode;
	
	@Column(name = "SALES_LIMIT_1")
	private double salesLimit1;

	@Column(name = "ACCOUNT_TYPE_2")
	private int accountType2;

	@Column(name = "DAILY_LIMIT_2")
	private double dailyLimit2;
	
	@Column(name = "WEEKLY_LIMIT_2")
	private double weeklyLimit2;
	
	@Column(name = "MONTHLY_LIMIT_2")
	private double monthlyLimit2;
	
	@Column(name = "SALES_LIMIT_2")
	private double salesLimit2;
	
	@Column(name = "PAYMENT_TYPE")
	private String paymentType;
	
	@Column(name = "PAYMENT_TERMS")
	private String paymentTerms;
	
	@Column(name = "START_TIME")
	private Date startTime;
	
	@Column(name = "END_TIME")
	private Date endTime;

	@Column(name = "AVAILABLE_CHANNELS")
	private String availableChannels;

	@Column(name = "PWD_EXPIRY_DATE")
	private Date pwdExpiryDate;
	
	@Column(name = "PIN_EXPIRY_DATE")
	private Date pinExpiryDate;
	
	@Column(name = "CONTACT_NAME")
	private String contactName;
}
