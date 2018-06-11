package com.web.kong.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.kong.DTO.BoardiDTO;

@Service
public class BoardService implements IBoardService{

	@Autowired
	private BoardDAO dao;
	
	@Override
	public List<BoardiDTO> list() {
		
		return dao.list();
	}
	
	@Override
	public List<BoardiDTO> vlist(String boardnum) {
		// TODO Auto-generated method stub
		return dao.vlist(boardnum);
	}
	
	@Override
	public int add(BoardiDTO dto) {
		// TODO Auto-generated method stub
		return dao.add(dto);
	}
	
	@Override
	public int del(String boardnum) {
		// TODO Auto-generated method stub
		return dao.del(boardnum);
	}
	
	
}
