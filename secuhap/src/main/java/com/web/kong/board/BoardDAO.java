package com.web.kong.board;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.web.kong.DTO.BoardDTO;

@Repository
public class BoardDAO {
	@Autowired
	private SqlSessionTemplate sql;

	public List<BoardDTO> list() {
		// TODO Auto-generated method stub
		return sql.selectList("board.list");
	}

	public List<BoardDTO> list2(BoardDTO dto) {
		// TODO Auto-generated method stub
		return sql.selectList("board.boardList", dto);
	}
	
	
	public int add(BoardDTO dto) {
		return sql.insert("board.add", dto);
	}
	
	public int edit(BoardDTO dto) {
		return sql.insert("board.edit", dto);
	}
	
	public int del(BoardDTO dto) {
		return sql.delete("board.del", dto);
	}

}
