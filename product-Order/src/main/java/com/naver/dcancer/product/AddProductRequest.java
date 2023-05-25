package com.naver.dcancer.product;

import org.springframework.util.Assert;

class AddProductRequest {
	final String name;
	final int price;
	final DiscountPolicy discountPolicy;
	
	public AddProductRequest(final String name, final int price, final DiscountPolicy discountPolicy) {
		this.discountPolicy = discountPolicy;
		this.name = name;
		this.price = price;
		
		Assert.hasText(name, "상품명은 필수 입니다.");
		Assert.isTrue(price > 0 , "상품가격은 0 보다 커야 합니다.");
		Assert.notNull(discountPolicy,"할인정책은 필수!");
	}
}