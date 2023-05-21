package com.naver.dcancer.repository;

import java.util.List;
import java.util.Optional;

import com.naver.dcancer.domain.Member;

public interface MemberRepositry {
	Member save(Member member);
	Optional<Member> findById(Long id);
	Optional<Member> findByName(String name);
	List<Member> findAll();
	void storeclear();
}
