package com.sixdee.ooredoo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sixdee.ooredoo.domain.SwiggyCrudEntity;
import com.sixdee.ooredoo.request.SwiggyCrudRequest;
import com.sixdee.ooredoo.response.SwiggyCrudResponse;
import com.sixdee.ooredoo.service.SwiggyCrudService;

import io.github.cepr0.crud.api.AbstractCrudController;

/**
 * 
 * @author arun.sudhakaran
 *
 * Date 18/11/2022
 */

@RestController
@RequestMapping("swiggy-crud-test")
public class SwiggyCrudController /*extends AbstractCrudController<SwiggyCrudEntity, Integer, SwiggyCrudRequest, SwiggyCrudResponse>*/ {

    /*public SwiggyCrudController(SwiggyCrudService service) {
        super(service);
    }
    
    @PostMapping
    @Override
    public ResponseEntity<SwiggyCrudResponse> create(@RequestBody SwiggyCrudRequest request) {
        return super.create(request);
    }
    
    @PatchMapping("/{id}")
    @Override
    public ResponseEntity<SwiggyCrudResponse> update(@PathVariable("id") Integer id, @RequestBody SwiggyCrudRequest request) {
        return super.update(id, request);
    }
    
    @SuppressWarnings("unchecked")
	@DeleteMapping("/{id}")
    @Override
    public ResponseEntity<SwiggyCrudResponse> delete(@PathVariable("id") Integer id) {
        return super.delete(id);
    }
    
    @GetMapping("/{id}")
    @Override
    public ResponseEntity<SwiggyCrudResponse> getOne(@PathVariable("id") Integer id) {
        return super.getOne(id);
    }
    
    @GetMapping
    @Override
    public ResponseEntity<List<SwiggyCrudResponse>> getAll() {
        return super.getAll();
    }*/
}
