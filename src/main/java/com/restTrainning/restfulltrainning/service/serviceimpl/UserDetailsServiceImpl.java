package com.restTrainning.restfulltrainning.service.serviceimpl;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.restTrainning.restfulltrainning.model.AccountModel;
import com.restTrainning.restfulltrainning.repository.Login_LogoutRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private Login_LogoutRepository login_LogoutRepository;
	 
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
			AccountModel loginModel=login_LogoutRepository.findByUsername(username);
			
			if (loginModel == null) {
				throw new UsernameNotFoundException("User Not Found with username : "+username);
			}
			
			List<SimpleGrantedAuthority> role= new ArrayList<>();
			role.add(new SimpleGrantedAuthority("ROLE_".concat(loginModel.getAuthority())));
	
				return new User(loginModel.getUsername(), loginModel.getPassword(), role);
	}

}
