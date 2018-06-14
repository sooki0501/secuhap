package com.web.kong.boardi;

import java.util.List;

import com.web.kong.DTO.BoardiDTO;

public interface IBoardiService {

	List<BoardiDTO> list();

	List<BoardiDTO> vlist(String boardnum);

	int add(BoardiDTO dto);

	int del(String boardnum);

	int edit(BoardiDTO dto);


	
}
