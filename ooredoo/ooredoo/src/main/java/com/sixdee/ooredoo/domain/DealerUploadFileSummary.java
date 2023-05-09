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
@Table(name = "ETP_DEALER_UPLOAD_FILE_SUMMARY")
public class DealerUploadFileSummary implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "FILE_ID")
	private int fileId;
	
	@Column(name = "FILE_NAME")
	private int fileName;
	
	@Column(name = "ACTION")
	private int action;
	
	@Column(name = "UPLOADED_USER_ID")
	private String uploadedUserId;
	
	@Column(name = "UPLOADED_DATE")
	private Date uploadedDate;
}
