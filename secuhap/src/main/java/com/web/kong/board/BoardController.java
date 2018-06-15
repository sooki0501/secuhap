package com.web.kong.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.web.kong.DTO.BoardDTO;


@Controller
public class BoardController {

	@Autowired
	private IBoardService service;
	
	
	@RequestMapping(method={RequestMethod.GET}, value="/list")
	public String list(HttpServletRequest req, BoardDTO dto) {

		List<BoardDTO> list = service.list();
		
		req.setAttribute("list", list);
		
	/*	List<BoardDTO> readcount = service.readcount(dto);
		req.setAttribute("readcount", readcount);*/
	
		return "board/list";
	}
	
	@RequestMapping(method={RequestMethod.GET}, value="/content")
	public String content(HttpServletRequest req, BoardDTO dto) {

		List<BoardDTO> list2 = service.list2(dto);
		
		req.setAttribute("list2", list2); 
	
		return "board/content";
	}
	
	@RequestMapping(method={RequestMethod.GET}, value="/writeForm")
	public String writeForm(HttpServletRequest req) {

		
		return "board/writeForm";
	}
	
	@RequestMapping(method={RequestMethod.POST}, value="/writePro")
	public String writePro(HttpServletRequest req, BoardDTO dto) {
		

		int result=service.add(dto);
	
		req.setAttribute("result", result);
		
		return "board/writePro";
	}
	
	@RequestMapping(method={RequestMethod.GET}, value="/updateForm")
	public String updateForm(HttpServletRequest req, BoardDTO dto) {
		
		List<BoardDTO> list2=service.list2(dto);
		
		req.setAttribute("list2", list2);

		
		return "board/updateForm";
	}
	
	@RequestMapping(method={RequestMethod.POST}, value="/updatePro")
	public String updatePro(HttpServletRequest req, BoardDTO dto) {

		int result=service.edit(dto);
		
		req.setAttribute("result", result);
		
		return "board/updatePro";
	}
	
	@RequestMapping(method={RequestMethod.GET}, value="/deleteForm")
	public String deleteForm(HttpServletRequest req) {

		return "board/deleteForm";
	}
	
	@RequestMapping(method={RequestMethod.GET}, value="/deletePro")
	public String deletePro(HttpServletRequest req, BoardDTO dto) {
		
		int result = service.del(dto);
		
		req.setAttribute("result", result);
		
		return "board/deletePro";
	}
	
	
}


