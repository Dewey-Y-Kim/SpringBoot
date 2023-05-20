package com.naver.dcancer.repository;

import java.util.List;

import org.apache.catalina.Store;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import com.naver.dcancer.domain.Member;

public class repository {

	MemberRepositry repository = new MemoryMemberRepository();
	
	@AfterEach
	public void after() {
		System.out.println("test");
		
	}
	@Test
	public void save() {
			Member member = new Member();
			member.setName("Test1");
			repository.save(member);
			
			Member result = repository.findById(member.getId()).get();
			/*
			Assertions.assertEquals(result, member); 
			Assertions.assertEquals(result, null);
			*/
			Assertions.assertThat(member).isEqualTo(result);
			
	}
	@Test
	public void findByName() {
		Member member1 =  new Member();
		member1.setName("testSpring1");
		repository.save(member1);
		Member member2 = new Member();
		member2.setName("testSpring2");
		repository.save(member2);
		
		List<Member> result = repository.findAll();
		
		Assertions.assertThat(result.size()).isEqualTo(2);
	}
	
	public void Storeclear() {
		
	}
}
