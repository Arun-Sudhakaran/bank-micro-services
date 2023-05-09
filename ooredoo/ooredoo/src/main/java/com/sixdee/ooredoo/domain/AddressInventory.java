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
 * 
 * The table name of previous application was MFS_ETOPUP_ADDRESS_REPOSITORY
 * That was changed to ETP_ADDRESS_INVENTORY to avoid confusion with naming of domain an repository 
 */

@Entity
@Getter @Setter
@Table(name = "ETP_ADDRESS_INVENTORY")
public class AddressInventory implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	
	@Column(name = "REGION_NAME")
	private String regionName;
	
	@Column(name = "WILAYA_NAME")
	private String wilayaName;
	
	@Column(name = "LOCALITY_NAME")
	private String localityName;
	
	@Column(name = "REGION_NAME_A")
	private String regionNameA;
	
	@Column(name = "WILAYA_NAME_A")
	private String wilayaNameA;
	
	@Column(name = "LOCALITY_NAME_A")
	private String localityNameA;
	
}
