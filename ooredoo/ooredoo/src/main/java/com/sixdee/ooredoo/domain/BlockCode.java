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
@Table(name = "ETP_BLOCK_CODES")
public class BlockCode implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "BLOCK_CODE")
	private int blockCode;
	
	@Column(name = "DESCRIPTION")
	private String description;
}
