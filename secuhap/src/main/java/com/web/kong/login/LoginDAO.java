package com.web.kong.login;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.web.kong.DTO.UserDTO;

@Repository
public class LoginDAO {
	
	@Autowired
	private SqlSessionTemplate sql;

	public UserDTO login(UserDTO dto) {
		return sql.selectOne("login.in", dto);
	}

	/*public UserDTO checkId(UserDTO dto) {
		return sql.selectOne("login.checkId", dto);
	}*/

	/*public List<UserDTO> userList() {
		return sql.selectList("login.user");
	}*/

}
