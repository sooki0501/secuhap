package com.web.kong.login;

import java.util.List;

import com.web.kong.DTO.UserDTO;

public interface ILoginService {

	public UserDTO login(UserDTO dto);

	//public UserDTO checkId(UserDTO dto);
	
	//전체목록
	//List<UserDTO> userList();

}
