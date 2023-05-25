package com.naver.dcancer.product;

public class ProductAdapter implements ProductPort{
	private final ProductRepository productRepository;
	
	public ProductAdapter(final ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	public void save(final Product product) {
		ProductRepository productRepository = new ProductRepository();
		productRepository.save(product);
	}
	
}