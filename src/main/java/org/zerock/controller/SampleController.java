package org.zerock.controller;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.zerock.domain.MemberVO;

import lombok.extern.java.Log;

@Controller
@Log
public class SampleController {
	
	@GetMapping("sample/page1")
	public void page1(){
		
	}
	
	
	
	@GetMapping("/sample3")
	public void sample3(Model model){
		
		List<MemberVO> list = new ArrayList<>();
		
		for(int i = 0; i<10; i++){
			MemberVO vo = new MemberVO(123, "u0"+i, "p0"+i, "홍길동", new Timestamp(System.currentTimeMillis()));
			list.add(vo);
		}
		model.addAttribute("list", list);
		
	}
	
	
	@GetMapping("/hello")
	public void hello(Model model){
		
		log.info("hello");
		model.addAttribute("GREETING", "안녕 세상아!!!!");
	}
	
	@GetMapping("/sample2")
	public void sample2(Model model){
		
		MemberVO vo = new MemberVO(123, "u00", "p00", "홍길동", new Timestamp(System.currentTimeMillis()));
		
		model.addAttribute("vo", vo);
	}
}
