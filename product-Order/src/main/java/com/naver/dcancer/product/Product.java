package com.naver.dcancer.product;

import org.springframework.util.Assert;

public class Product{ 
	private String name;
	private int price;
	private DiscountPolicy discountPolicy;
	private Long id;
	
	public Product(String name2, int price2, DiscountPolicy discountPolicy2) {
		// TODO Auto-generated constructor stub
	}
	public void Porduct(String name, int price, DiscountPolicy discountPolicy) {
		Assert.hasText(name, "상품명은 필수 입니다.");
		Assert.isTrue(price > 0 , "상품가격은 0 보다 커야 합니다.");
		Assert.notNull(discountPolicy,"할인정책은 필수!");
		
		this.name = name;
		this.price = price;
		this.discountPolicy = discountPolicy;
	}
	public void assignId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return id;
	}
}