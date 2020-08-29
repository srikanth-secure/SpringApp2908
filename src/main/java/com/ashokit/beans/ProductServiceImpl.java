package com.ashokit.beans;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ashokit.model.Product;

@Component
public class ProductServiceImpl implements ProductService {

	@Override
	public List<Product> CVSDataReader(List<Product> productList) {

		return productList;
	}

	@Override
	public List<Product> productsDataFilter(List<Product> productList) {
		return null;
	}

	@Override
	public List<Product> CVSDataWriter(List<Product> productList) {

		return productList;
	}
}
