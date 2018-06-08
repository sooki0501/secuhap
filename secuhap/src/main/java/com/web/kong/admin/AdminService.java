package com.web.kong.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.kong.DTO.UserDTO;

@Service
public class AdminService implements IAdminService{
	
	@Autowired
	private AdminDAO dao;
	
	@Override
	public List<UserDTO> userList() {
		
		return dao.userList();
	}
	
	@Override
	public int checkOk() {
		
		return dao.checkOk();
	}
	
	@Override
	public int checkNo() {
		
		return dao.checkNo();
	}
	
}
