package com.web.kong.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.web.kong.DTO.BoardiDTO;

@Controller
public class BoardController {

	@Autowired
	private IBoardService service;
	
	@RequestMapping(method={RequestMethod.GET}, value="/board")
	public String Board(HttpServletRequest req) {

		List<BoardiDTO> list = service.list();
		
		req.setAttribute("list", list);
		
		return "board/board";
	}//board
	
	@RequestMapping(method={RequestMethod.GET}, value="boardView")
	public String BoardView(HttpServletRequest req, String boardnum) {
		
		List<BoardiDTO> vlist = service.vlist(boardnum);
		
		req.setAttribute("vlist", vlist);
		
		return "board/boardView";
	}//boardView
	
	
	
	@RequestMapping(method={RequestMethod.GET}, value="/boardAdd")
	public String BoardAdd(HttpServletRequest req) {
		
		return "board/boardAdd";
	}//boardAdd
	
	@RequestMapping(method={RequestMethod.POST}, value="/boardAddOk")
	public String BoardAddOk(HttpServletRequest req, BoardiDTO dto) {
		
		int result = service.add(dto);
				
		req.setAttribute("result", result);
		
		return "board/boardAddOk";
	}//boardAddOk
	
	
	@RequestMapping(method={RequestMethod.GET}, value="/boardDel")
	public String BoardDel(HttpServletRequest req, String boardnum) {
		
		int result = service.del(boardnum);
		
		req.setAttribute("result", result);
		
		return "board/boardDel";
	}
	
	@RequestMapping(method={RequestMethod.GET}, value="/boardEdit")
	public String BoardEdit(HttpServletRequest req, String boardnum) {
		
		List<BoardiDTO> vlist = service.vlist(boardnum);
		
		req.setAttribute("vlist", vlist);
		
		return "board/boardEdit";
	}
	
	@RequestMapping(method={RequestMethod.POST}, value="/boardEditOk")
	public String BoardEditOk(HttpServletRequest req, BoardiDTO dto) {
		
		int result = service.edit(dto);
		
		req.setAttribute("result", result);
		
		return "board/boardEditOk";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}//BoardController
