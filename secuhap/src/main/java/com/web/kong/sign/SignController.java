package com.web.kong.sign;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.web.kong.DTO.UserDTO;



@Controller
public class SignController {

	@Autowired
	private ISignService service;
	
	@RequestMapping(method={RequestMethod.GET}, value="/sign")
	public String Sign(HttpServletRequest req) {
		
		return "admin/sign";
	}
	
	@RequestMapping(method={RequestMethod.POST}, value="/signOk")
	public String SignOk(HttpServletRequest req,UserDTO dto) {
		
		int result = service.userAdd(dto);
		
		req.setAttribute("result", result);
		
		return "admin/signOk";
	}
	
	
}
