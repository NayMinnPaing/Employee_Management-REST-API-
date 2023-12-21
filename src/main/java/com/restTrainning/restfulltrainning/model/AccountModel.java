package com.restTrainning.restfulltrainning.model;

import lombok.Getter;
import lombok.Setter;

public class AccountModel {
 
	
	@Getter
	@Setter
	private String username;
	
	@Getter
	@Setter
	private String password;
	
	@Getter
	@Setter
	private String authority;
	
	@Getter
	@Setter
	private boolean isEnabled;
	
}
