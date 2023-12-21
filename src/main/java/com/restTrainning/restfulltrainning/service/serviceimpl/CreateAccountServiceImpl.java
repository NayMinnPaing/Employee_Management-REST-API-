package com.restTrainning.restfulltrainning.service.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.restTrainning.restfulltrainning.model.AccountModel;
import com.restTrainning.restfulltrainning.repository.AccountCreateRepository;
import com.restTrainning.restfulltrainning.service.CreateAccountService;

@Service
public class CreateAccountServiceImpl implements CreateAccountService {

	 @Autowired
	 private AccountCreateRepository accountCreateRepository;

	@Override
	public int createAccount(AccountModel accModel) {
		int result1=0;
		int result2=0;
		accModel.setEnabled(true);
		accModel.setPassword(new BCryptPasswordEncoder().encode(accModel.getPassword()));
		
		result1 = accountCreateRepository.createAccountToAccount(accModel);
		result2 = accountCreateRepository.createAccountToRole(accModel);
		
		
		return result1 + result2;
		
	}

}
