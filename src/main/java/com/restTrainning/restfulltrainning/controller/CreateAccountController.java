package com.restTrainning.restfulltrainning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.restTrainning.restfulltrainning.model.AccountModel;
import com.restTrainning.restfulltrainning.service.serviceimpl.CreateAccountServiceImpl;

@RestController
public class CreateAccountController {

	@Autowired
	private CreateAccountServiceImpl createAccountServiceImpl;
	
	@ResponseBody
	@RequestMapping(value = "createAccount", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	public int cteateAccount(@RequestBody AccountModel accmodel) {
		
		
		return createAccountServiceImpl.createAccount(accmodel);
	}

}
