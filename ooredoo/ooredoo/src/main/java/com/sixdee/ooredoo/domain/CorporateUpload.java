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
@Table(name = "ETP_CORPORATE_UPLOAD")
public class CorporateUpload implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "FILE_NAME")
	private String fileName;
	
	@Column(name = "UPLOAD_BY")
	private String uploadBy;
	
	@Column(name = "TOTAL_SUCCESS")
	private int totalSuccess;
	
	@Column(name = "TOTAL_FAILURE")
	private int totalFailure;
	
	@Column(name = "UPLOAD_STATUS")
	private String uploadStatus;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED_DATE", updatable = false)
	private Date createdDate;
	
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATED_DATE", updatable = false)
	private Date updatedDate;

	@Column(name = "UPDATED_USER")
	private String updatedUser;
}
