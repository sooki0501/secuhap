package com.web.kong.sign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.kong.DTO.UserDTO;

@Service
public class SignService implements ISignService{

	@Autowired
	private SignDAO dao;
	
	@Override
	public int userAdd(UserDTO dto) {
		
		return dao.userAdd(dto);
	}
	
}
