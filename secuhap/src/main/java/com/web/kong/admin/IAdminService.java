package com.web.kong.admin;

import java.util.List;

import com.web.kong.DTO.UserDTO;

public interface IAdminService {

	List<UserDTO> userList();

	int checkOk();

	int checkNo();

	UserDTO logIn(UserDTO udto);

	
	

}
