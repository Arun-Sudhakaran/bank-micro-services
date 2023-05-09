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
@Table(name = "ETP_CORPORATE_EMP")
public class CorporateEmp implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "EMP_ID")
	private String empId;
	
	@Column(name = "EMP_NAME")
	private String empName;
	
	@Column(name = "CORPORATE_ID")
	private String corporateId;
	
	@Column(name = "EMP_ADDRESS")
	private String empAddress;
	
	@Column(name = "COR_EMP_ID")
	private String corEmpId;
	
	@Column(name = "DESIGNATION")
	private String designation;
	
	@Column(name = "MOBILE_NUM")
	private String mobileNum;
	
	@Column(name = "EMAIL_ID")
	private String emailId;
	
	@Column(name = "ACTIVE")
	private String active = "Y";
	
	@Column(name = "EXPIRY_DATE")
	private Date expiryDate;

	@Column(name = "CREATED_BY")
	private String createdBy;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_DATE", updatable = false)
	private Date createDate;
	
	@Column(name = "UPDATED_BY")
	private String updatedBy;
	
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATE_DATE", updatable = false)
	private Date updateDate;
}
