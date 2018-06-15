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
		
		//전체목록 넘겨주기
		//List<UserDTO> userList = service.userList();
		//req.setAttribute("userList", userList);
		//session 값 넘겨주기 위하여
		//UserDTO checkId = service.checkId(ldto);
		// req.setAttribute("checkId", checkId);
		// req.setAttribute("checkId", checkId);
		// checkId 값 받는것 = from Kong
		// session.setAttribute("checkId", checkId);
		//System.out.println("============= checkId  :" + checkId );
		
		UserDTO dto = service.login(ldto);
		dto.getCheckId();
		session.setAttribute("loginDTO", dto);
		//System.out.println("============= dto.getCheckId() : "+ dto.getCheckId());
		System.out.println("============= loginDTO  :" + dto );
		return "login/loginOk";
	}
	
	
	@RequestMapping("/success")
	public String success() {
		return "board/list";
	}
	
	
	@RequestMapping("/logout")
	public String logout (HttpSession session) {
		if(session.getAttribute("loginId") != null){
			session.invalidate();
		}
		return "login/login"; 
	}
	
}
