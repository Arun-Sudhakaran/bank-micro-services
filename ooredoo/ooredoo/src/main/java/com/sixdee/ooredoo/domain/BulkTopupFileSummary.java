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

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author arun.sudhakaran
 * @Date : 28/10/2022
 */

@Entity
@Getter @Setter
@Table(name = "ETP_BULK_TOPUP_FILE_SUMMARY")
public class BulkTopupFileSummary implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "FILE_ID")
	private int fileId;
	
	@Column(name = "FILE_NAME")
	private String fileName;
	
	@Column(name = "UPLOADED_USER_ID")
	private String uploadedUserId;
	
	@Column(name = "REMARK")
	private String remark;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPLOADED_DATE", updatable = false)
	private Date updatedDate;
}
