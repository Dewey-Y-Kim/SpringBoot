package com.naver.dcancer.Service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.naver.dcancer.domain.Member;
import com.naver.dcancer.repository.MemberRepositry;
import com.naver.dcancer.repository.MemoryMemberRepository;
import com.naver.dcancer.service.MemberService;
public class MemberServiceTest {
	
	MemoryMemberRepository memory = new MemoryMemberRepository();
	MemberService service = new MemberService(memory);
	
	
	@BeforeEach
	void beforeEach() {
		MemoryMemberRepository memory = new MemoryMemberRepository();
		
	}
	
	@AfterEach
	void afterEach() {
		memory.storeclear();
	}
	
	@Test
	void join() {
		// given    when    then
		
		//given
		Member member = new Member();
		member.setName("hello");
		
		//when
		Long saveId = service.join(member);
		
		//then
		Optional<Member> one = service.findOne(saveId);
		Assertions.assertThat(member.getName()).isEqualTo(one.get().getName());
		
	}
	@Test
	void joinSame() {
		//given
		Member member1 = new Member();
		member1.setName("spring");
		Member member2 = new Member();
		member2.setName("spring");
		
		//when
		service.join(member1);
		try {
			service.join(member2);
			fail();
		} catch(IllegalStateException e){
			assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
		}
				
	}
	@Test
	void joinSameVerTwo(){
		//given
				Member member1 = new Member();
				member1.setName("spring");
				Member member2 = new Member();
				member2.setName("spring");
				
				//when
				service.join(member1);
				IllegalStateException e = assertThrows(IllegalStateException.class, () -> service.join(member2));
				assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
	}
	void findMember() {
		
	}
	
	void findOne(Long id) {
		
	}
}
