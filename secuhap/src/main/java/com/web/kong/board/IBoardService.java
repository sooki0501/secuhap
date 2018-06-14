package com.web.kong.board;

import java.util.List;

import com.web.kong.DTO.BoardDTO;

public interface IBoardService {

	List<BoardDTO> list();
	
	List<BoardDTO> list2(BoardDTO dto);
	
	int add(BoardDTO dto);
	
	int edit(BoardDTO dto);
	
	int del(BoardDTO dto);

}
