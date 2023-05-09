package com.sixdee.ooredoo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import io.github.cepr0.crud.model.JpaEntity;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author arun.sudhakaran
 *
 * Date 18/11/2022
 */

@Entity
@Getter @Setter
@Table(name = "ETP_SWIGGY_CRUD_ENTITY")
public class SwiggyCrudEntity extends JpaEntity<Integer> {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue
    @Column(name = "ENTITY_ID")
	private Integer id;

	@Column(name = "ENTITY_NAME")
	private String entityName;
}
