package com.naver.dcancer.product;

import java.util.HashMap;

class ProductRepository{
	
	private ProductRepositoryData data = new ProductRepositoryData(new HashMap<>(), 0L);

	public void save(final Product product) {
		product.assignId(++data.seq);
		data.persistence.put(product.getId(), product);
	}
}