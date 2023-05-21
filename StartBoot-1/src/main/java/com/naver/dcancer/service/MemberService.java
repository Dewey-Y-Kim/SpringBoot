package com.naver.dcancer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.naver.dcancer.domain.Member;
import com.naver.dcancer.repository.MemoryMemberRepository;

@Service
public class MemberService {
	private final MemoryMemberRepository memberRepository;
	
	
	public MemberService(MemoryMemberRepository memberRepository) {
		super();
		this.memberRepository = memberRepository;
	}
	/**
	 * 
	 * 회원가입
	 * 
	 */
	public Long join(Member member) {
		
		// 중복회원 검증
		Optional<Member> result = memberRepository.findByName(member.getName());
		result.ifPresent(m ->{
			throw new IllegalStateException("이미 존재하는 회원입니다.");
		});
		//Optional null이 있을 가능성이 있으면 Optional에넣어 보관.
		return member.getId();
	}
	//전체 회원 조회
	public List<Member> findMembers(){
		return memberRepository.findAll();
	}
	
	public Optional<Member> findOne(Long memberId){
		return memberRepository.findById(memberId);
	}
}
