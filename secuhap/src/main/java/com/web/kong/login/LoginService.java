package com.web.kong.login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.kong.DTO.UserDTO;

@Service
public class LoginService implements ILoginService {

	@Autowired
	private LoginDAO dao;

	@Override
	public UserDTO login(UserDTO dto) {
		return dao.login(dto);
	}

	/*@Override
	public UserDTO checkId(UserDTO dto) {
		return dao.checkId(dto);
	}*/

	//전체목록
	/*@Override
	public List<UserDTO> userList() {
		return dao.userList();
	}*/
	
	
	
	
	
}
