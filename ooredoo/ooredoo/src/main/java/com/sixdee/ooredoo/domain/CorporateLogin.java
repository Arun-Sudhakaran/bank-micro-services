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
@Table(name = "ETP_CORPORATE_LOGIN")
public class CorporateLogin implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CORPORATE_ID")
	private String corporateId;
	
	@Column(name = "CORPORATE_NAME")
	private String corporateName;
	
	@Column(name = "PASSWORD")
	private String password;

	@Column(name = "PIN")
	private String pin;
	
	@Column(name = "PARENT_ID")
	private String parentId;
	
	@Column(name = "MSISDN")
	private String msisdn;
	
	@Column(name = "STATUS")
	private int status;

	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@Column(name = "ROLE_ID")
	private int roleId;

	@Column(name = "EMAIL_ID")
	private String emailId;
	
	@Column(name = "ADDRESS")
	private String address;
	
	@Column(name = "FAX")
	private String fax;
	
	@Column(name = "ID_NUMBER")
	private String idNumber;

	@Column(name = "WRONG_PWD_ATTEMPT")
	private int wrongPwdAttempt;
	
	@Column(name = "WRONG_PIN_ATTEMPT")
	private int wrongPinAttempt;
	
	@Column(name = "SOFT_DELETE")
	private boolean softDelete;
	
	@Column(name = "BLOCKED_DATE")
	private Date blockedDate;

	@Column(name = "BLOCK_CODE")
	private int blockCode;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "REGISTERED_DATE", updatable = false)
	private Date registeredDate;
	
	@Column(name = "LAST_LOGIN_TIME")
	private Date lastLoginTime;

	@Column(name = "CREATED_USER")
	private String createdUser;
	
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATED_DATE", updatable = false)
	private Date updatedDate;
	
	@Column(name = "UPDATED_USER")
	private String updatedUser;
	
	@Column(name = "RF1")
	private String rf1;
	
	@Column(name = "RF2")
	private String rf2;
	
	@Column(name = "RF3")
	private String rf3;
}
