package com.naver.dcancer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.naver.dcancer.service.MemberService;

@Controller
public class MemberController {
	
	private final MemberService service;
	
	@Autowired
	public MemberController(MemberService service) {
 		this.service = service;
	}
	
	
}
