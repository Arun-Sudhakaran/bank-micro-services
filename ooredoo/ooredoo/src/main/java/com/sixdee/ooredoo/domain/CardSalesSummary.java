package com.sixdee.ooredoo.domain;

import java.io.Serializable;
import java.util.Date;

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
@Table(name = "ETP_CARD_SALES_SUMMARY")
public class CardSalesSummary implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	
	@Column(name = "USER_ID")
	private String userId;
	
	@Column(name = "POS_ID")
	private String posId;
	
	@Column(name = "DATE")
	private Date date;
	
	@Column(name = "RATE_CARD_ID")
	private int rateCardId;
	
	@Column(name = "CARD_SALES_VALUE")
	private double cardSalesValue;

	@Column(name = "CARD_SALES_COUNT")
	private int cardSalesCount;

	@Column(name = "OPERATOR_ID")
	private int operatorId;
	
	@Column(name = "CHANNEL_ID")
	private int channelId;
}
