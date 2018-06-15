package com.web.kong.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.kong.DTO.BoardDTO;



@Service
public class BoardService implements IBoardService{

	@Autowired
	private BoardDAO dao;
	
	@Override
	public List<BoardDTO> list() {
		// TODO Auto-generated method stub
		return dao.list();
	}
	
	@Override
	public List<BoardDTO> list2(BoardDTO dto) {
		
		return dao.list2(dto);
	}
	
	@Override
	public int add(BoardDTO dto) {
		
		return dao.add(dto);
	}
	
	@Override
	public int edit(BoardDTO dto) {
		
		return dao.edit(dto);
	}
	
	@Override
	public int del(BoardDTO dto) {
		
		return dao.del(dto);
	}
	
	/*@Override
	public List<BoardDTO> readcount(BoardDTO dto) {
		
		return dao.readcount(dto);
	}
	*/
	
}
