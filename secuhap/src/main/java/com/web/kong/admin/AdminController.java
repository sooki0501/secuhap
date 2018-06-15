package com.web.kong.admin;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.web.kong.DTO.UserDTO;


@Controller
public class AdminController {

	@Autowired
	private IAdminService service;
	
	@RequestMapping(method={RequestMethod.GET}, value="/admin")
	public String Admin(HttpServletRequest req) {

		List<UserDTO> userList = service.userList();
		
		req.setAttribute("userList", userList);
		
		return "admin/adminTest";
	}
	
	@RequestMapping(method={RequestMethod.GET}, value="/checkOk")
	public String CheckOk(HttpServletRequest req) {
		
		int result = service.checkOk();
		
		List<UserDTO> userList = service.userList();
		
		req.setAttribute("userList", userList);
		
		return "admin/admin";
	}
	
	@RequestMapping(method={RequestMethod.GET}, value="/checkNo")
	public String CheckNo(HttpServletRequest req) {
		
		int result = service.checkNo();
		
		List<UserDTO> userList = service.userList();
		
		req.setAttribute("userList", userList);
		
		return "admin/admin";
	}
	
	@RequestMapping(method={RequestMethod.GET}, value="/login")
	public String adminLogin(HttpServletRequest req) {
		
		return "board/login";
		
	}
	
	
	
	 @RequestMapping(method= {RequestMethod.POST},value="/loginOk" )
	 public String loginok(HttpServletRequest req,UserDTO udto,HttpSession session) {
		  
		  UserDTO dto = service.logIn(udto);
		  
		  session.setAttribute("UserDTO", dto);
		  
		  return "board/loginOk";
		  
	  }
	
	
	

}//TestController






































