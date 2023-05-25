package com.naver.dcancer.productService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.naver.dcancer.product.ProductPort;
import com.naver.dcancer.product.ProductRepositoryData;
import com.naver.dcancer.product.*;

public class ProductServiceTest {
	
	private ProductServiceTest productService;
	private ProductPort productPort;
	private ProductRepositoryData productRepository;
	
	@BeforeEach
	void setUp() {
		productPort = new ProductAdapter(productRepository);
		productService = new ProductService(productPort);
	}
	
	@Test
	void 상품등록() {
		final String name = "상품명";
		final int price = 1000;
		final DiscountPolicy disconutPolicy = DiscountPolicy.NONE;
		final AddProductRequest  request = new AddProductRequest("상품명",1000, DiscountPolicy.NONE);
		productService.addProduct(request);
	}
}
