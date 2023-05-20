package com.naver.dcancer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloCTL {
	
	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("data","test !!");
		return "hello";
		
	}
	@GetMapping("/hello_mvc")
	public String helloMvc(@RequestParam(value="name", required=false) String name,Model model) {
		model.addAttribute("name", name);
		return "hello_mvc";
	}
	
	@GetMapping("hello-str")
	@ResponseBody
	public String helloString(String name) {
		return "hello"+name;
	}
	
	@GetMapping("hello-api")
	@ResponseBody
	public Hello helloApi(String name) {
		Hello hello =new Hello();
		hello.setName(name);
		return hello;
		
	}
	
	
	static class Hello{
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}
	@GetMapping("hello-test")
	public ModelAndView hello_test(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("hello");
		return mav;
	}
	
}
 