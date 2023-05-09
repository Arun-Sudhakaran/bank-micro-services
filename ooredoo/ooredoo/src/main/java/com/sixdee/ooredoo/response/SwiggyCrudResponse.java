package com.sixdee.ooredoo.response;

import io.github.cepr0.crud.dto.CrudResponse;
import lombok.Data;

/**
 * 
 * @author arun.sudhakaran
 *
 * Date 18/11/2022
 */

@Data
public class SwiggyCrudResponse implements CrudResponse<Integer> {
    
	private static final long serialVersionUID = 1L;
	
	private Integer id;
    private String entityName;
}
