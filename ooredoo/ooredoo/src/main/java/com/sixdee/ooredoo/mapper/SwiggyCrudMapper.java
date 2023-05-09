package com.sixdee.ooredoo.mapper;

import org.mapstruct.Mapper;

import com.sixdee.ooredoo.domain.SwiggyCrudEntity;
import com.sixdee.ooredoo.request.SwiggyCrudRequest;
import com.sixdee.ooredoo.response.SwiggyCrudResponse;

import io.github.cepr0.crud.mapper.CrudMapper;

/**
 * 
 * @author arun.sudhakaran
 *
 * Date 18/11/2022
 */

@Mapper(config = CrudMapper.class)
public abstract class SwiggyCrudMapper implements CrudMapper<SwiggyCrudEntity, SwiggyCrudRequest, SwiggyCrudResponse> {

}
