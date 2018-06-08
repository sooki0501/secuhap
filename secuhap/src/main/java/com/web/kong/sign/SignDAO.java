package com.web.kong.sign;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.web.kong.DTO.UserDTO;

@Repository
public class SignDAO {

	@Autowired
	private SqlSessionTemplate sql;

	public int userAdd(UserDTO dto) {
		
		return sql.insert("sign.signOk", dto);
	}
	
}
