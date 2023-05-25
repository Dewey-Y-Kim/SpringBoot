package com.naver.dcancer.product;

import java.util.Map;

public class ProductRepositoryData {
	public Map<Long, Product> persistence;
	public Long seq;

	public ProductRepositoryData(Map<Long, Product> persistence, Long seq) {
		this.persistence = persistence;
		this.seq = seq;
	}
}