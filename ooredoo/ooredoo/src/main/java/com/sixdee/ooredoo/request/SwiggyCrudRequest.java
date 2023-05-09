package com.sixdee.ooredoo.request;

import io.github.cepr0.crud.dto.CrudRequest;
import lombok.Data;

/**
 * 
 * @author arun.sudhakaran
 *
 * Date 18/11/2022
 */

@Data
public class SwiggyCrudRequest implements CrudRequest {

	private String entityName;
}
