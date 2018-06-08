package com.web.kong.admin;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.web.kong.DTO.UserDTO;

@Repository
public class AdminDAO {

	@Autowired
	private SqlSessionTemplate sql;

	public List<UserDTO> userList() {
		
		return sql.selectList("admin.user");
	}

	public int checkOk() {
		
		return sql.update("admin.checkOk");
	}

	public int checkNo() {
		
		return sql.update("admin.checkNo");
	}

	
	
}
