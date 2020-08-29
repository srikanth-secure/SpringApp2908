package com.ashokit.beans;

import java.util.List;

import com.ashokit.model.Product;

public interface ProductService {
	List<Product> CVSDataReader(List<Product> productList);

	List<Product> productsDataFilter(List<Product> productList);

	List<Product> CVSDataWriter(List<Product> productList);

}
