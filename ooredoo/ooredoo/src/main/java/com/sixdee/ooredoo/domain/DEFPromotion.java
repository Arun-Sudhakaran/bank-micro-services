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
@Table(name = "ETP_DEF_PROMOTION")
public class DEFPromotion implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "PROMOTION_ID")
	private int promotionId;
	
	@Column(name = "PROMOTION_NAME")
	private String promotionName;
	
	@Column(name = "PROMOTION_CRITERIA")
	private String promotionCriteria;
	
	@Column(name = "PROMOTION_CREATION_DATE")
	private Date promotionCreationDate;
	
	@Column(name = "PROMOTION_EXPIRY_DATE")
	private Date promotionExpiryDate;
	
	@Column(name = "PROMOTION_STATUS")
	private String promotionStatus;
	
	@Column(name = "PROMOTION_PRIORITY")
	private int promotionPriority;
	
	@Column(name = "PROMOTION_LAST_MODIFY")
	private Date promotionLastModify;

	@Column(name = "CREATED_BY")
	private String createdBy;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_DATE", updatable = false)
	private Date createDate;

	@Column(name = "UPDATED_BY")
	private String updatedBy;
	
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATE_DATE", updatable = false)
	private Date updateDate;
	
	@Column(name = "PAYMENT_PROFILE")
	private String paymentProfile;
	
	@Column(name = "TRANSACTION_TYPE")
	private int transactionType;
}
