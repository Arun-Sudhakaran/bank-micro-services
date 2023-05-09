package com.sixdee.ooredoo.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Setter;

import lombok.Getter;

/**
 * 
 * @author arun.sudhakaran
 * @Date : 28/10/2022
 */

@Entity
@Getter @Setter
@Table(name = "ETP_DCRM_SUBSCRIPTION_PLANS")
public class DCRMSubscriptionPlan implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	
	@Column(name = "PLAN_NAME")
	private String planName;
	
	@Column(name = "DISPLAY_EN_NAME")
	private String displayEnName;
	
	@Column(name = "DISPLAY_AR_NAME")
	private String displayArName;
	
	@Column(name = "PLAN_DESC")
	private String planDesc;
	
	@Column(name = "DISPLAY_TYPE")
	private String displayType;
}
