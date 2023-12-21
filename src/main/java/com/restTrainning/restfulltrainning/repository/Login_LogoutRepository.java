package com.restTrainning.restfulltrainning.repository;

import org.apache.ibatis.annotations.Mapper;

import com.restTrainning.restfulltrainning.model.AccountModel;

@Mapper
public interface Login_LogoutRepository {

	public AccountModel findByUsername(String username);
}
