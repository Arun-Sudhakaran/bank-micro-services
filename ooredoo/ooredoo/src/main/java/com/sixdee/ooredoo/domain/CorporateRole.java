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

@Entity
@Getter @Setter
@Table(name = "ETP_CORPORATE_ROLES")
public class CorporateRole implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ROLE_ID")
	private int roleId;
	
	@Column(name = "ROLE_NAME")
	private String roleName;
	
	@Column(name = "ROLE_DESC")
	private String roleDesc;
	
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
