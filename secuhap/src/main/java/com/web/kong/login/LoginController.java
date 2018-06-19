package com.web.kong.login;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.web.kong.DTO.UserDTO;

@Controller
public class LoginController {

	@Autowired
	private ILoginService service;
	
	@RequestMapping("/main")
	public String main() {
		return "login/login";
	}
	
	
	
	@RequestMapping(method= {RequestMethod.POST},value="/login")
	public String loginOk(HttpServletRequest req, UserDTO ldto, HttpSession session) {
		
		UserDTO dto = service.login(ldto);
		session.setAttribute("loginDTO", dto);
		System.out.println("============= loginDTO  :" + dto );
		return "login/loginOk";
	}
	
	
	
	@RequestMapping("/logout")
	public String logout (HttpSession session) {
		if(session.getAttribute("loginId") != null){
			session.invalidate();
		}
		return "login/login"; 
	}
	
}
