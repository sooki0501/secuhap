package com.web.kong.board;

import java.util.List;

import com.web.kong.DTO.BoardiDTO;

public interface IBoardService {

	List<BoardiDTO> list();

	List<BoardiDTO> vlist(String boardnum);

	int add(BoardiDTO dto);

	int del(String boardnum);

	int edit(BoardiDTO dto);


	
}
