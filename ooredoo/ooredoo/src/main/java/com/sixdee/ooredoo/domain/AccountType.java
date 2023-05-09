package com.sixdee.ooredoo.domain;

import java.io.Serializable;

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
@Table(name = "ETP_ACCOUNT_TYPE")
public class AccountType implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ET_ACCOUNT_TYPE")
	private int accountType;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "CREATE_STATUS")
	private int createStatus = 1;
	
	@Column(name = "VIEW_STATUS")
	private int viewStatus = 1;
	
	@Column(name = "LIMIT_ENABLED")
	private boolean limitEnabled;
	
	@Column(name = "IS_DEFAULT_CREATE")
	private boolean isDefaultCreate = false;
}
