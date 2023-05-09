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
@Table(name = "ETP_CONFIG_PARAMETERS")
public class ConfigParameter implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	
	@Column(name = "PARAMETER_NAME")
	private String parameterName;
	
	@Column(name = "PARAMETER_VALUE")
	private String parameterValue;
	
	@Column(name = "PARAMETER_DESC")
	private String parameterDesc;
	
	@Column(name = "PARAMETER_VALUE_TYPE")
	private String parameterValueType;
	
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
