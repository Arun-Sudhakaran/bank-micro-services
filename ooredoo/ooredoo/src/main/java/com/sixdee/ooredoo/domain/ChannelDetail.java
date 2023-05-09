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
@Table(name = "ETP_CHANNEL_DETAILS")
public class ChannelDetail implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CHANNEL_ID")
	private int channelId;
	
	@Column(name = "CHANNEL_NAME")
	private String channelName;
	
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
