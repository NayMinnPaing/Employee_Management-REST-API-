package com.restTrainning.restfulltrainning.repository;

import org.apache.ibatis.annotations.Mapper;

import com.restTrainning.restfulltrainning.model.AccountModel;

@Mapper
public interface AccountCreateRepository {
	
	public int createAccountToAccount(AccountModel accModel);
	public int createAccountToRole(AccountModel accModel);
}
