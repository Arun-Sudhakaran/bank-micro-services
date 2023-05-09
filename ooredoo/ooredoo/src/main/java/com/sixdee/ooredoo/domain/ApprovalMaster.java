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
@Table(name = "ETP_APPROVAL_MASTER")
public class ApprovalMaster implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	
	@Column(name = "PROFILE_ID")
	private int profileId;
	
	@Column(name = "APPROVAL_TYPE")
	private int approvalType;
	
	@Column(name = "APPROVAL_LEVEL_ID")
	private int approvalLevelId;
	
	@Column(name = "APPROVAL_USER_ID")
	private String approvalUserId;
	
	@Column(name = "SERVICE_ID")
	private int serviceId;
	
	@Column(name = "APPROVAL_PRIORITY")
	private int approvalPriority;
	
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
}
