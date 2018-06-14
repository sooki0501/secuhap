package com.web.kong.board;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.web.kong.DTO.BoardiDTO;

@Repository
public class BoardDAO {

	@Autowired
	private SqlSessionTemplate sql;

	public List<BoardiDTO> list() {
		// TODO Auto-generated method stub
		return sql.selectList("board.list");
	}

	public List<BoardiDTO> vlist(String boardnum) {
		// TODO Auto-generated method stub
		return sql.selectList("board.vlist", boardnum);
	}
	
	public int add(BoardiDTO dto) {
		// TODO Auto-generated method stub
		return sql.insert("board.add", dto);
	}

	public int del(String boardnum) {
		// TODO Auto-generated method stub
		return sql.delete("board.del", boardnum);
	}

	public int edit(BoardiDTO dto) {
		// TODO Auto-generated method stub
		return sql.update("board.edit", dto);
	}

	
}
