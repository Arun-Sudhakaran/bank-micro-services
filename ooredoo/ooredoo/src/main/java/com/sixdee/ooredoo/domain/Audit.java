package com.sixdee.ooredoo.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
@Table(name = "ETP_AUDIT")
public class Audit implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	
	@Column(name = "TABLE_NAME")
	private String tableName;
	
	@Column(name = "COLOUMN")
	private String coloumn;
	
	@Column(name = "ROW_UN_ID")
	private String rowUnId;
	
	@Column(name = "OLD_VALUE")
	private String oldValue;
	
	@Column(name = "NEW_VALUE")
	private String newValue;
	
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATED_DATE", updatable = false)
	private Date updatedDate;
	
	@Column(name = "UPDATED_USER")
	private String updatedUser;
	
	@Column(name = "ACTION")
	private String action;
	
	@Column(name = "MENU")
	private String menu;
	
	@Column(name = "SUB_MENU")
	private String subMenu;
}
