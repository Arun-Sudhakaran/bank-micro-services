package com.sixdee.ooredoo.controller;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sixdee.ooredoo.domain.ApprovalMaster;
import com.sixdee.ooredoo.repository.ApprovalMasterRepository;

/**
 * 
 * @author arun.sudhakaran
 * @Date : 28/10/2022
 */

@RestController
public class TestController {

	@Autowired
	private ApprovalMasterRepository approvalMasterRepository;
	
	@PostMapping(path = "/insert")
	public void insert(@RequestBody ApprovalMaster approvalMaster) {
		
		approvalMasterRepository.save(approvalMaster);
	}
	
	public static void main(String[] args) {
		
		//String jsonCommand = "{ createUser: \" + newUserName +"/" + " ," + "pwd: /" + newUserPassword + "/" + " ,"  + "roles : [" + roles_str + "]}" ;
	}
}
