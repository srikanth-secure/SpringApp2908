package com.ashokit.beans;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.model.Product;

@Service
public class productsDataFilter {
	private ProductService productService;
	List<Product> pList = new ArrayList<>();

	@Autowired
	public productsDataFilter(ProductService productService) {
		this.productService = productService;
	}

	public List<Product> filterData(List<Product> product) {
		for (Product p : product) {
			if (p.getProductPrice() >= 6000) {
				pList.add(p);
			}
		}
		// System.out.println("productsDataFilter");
		return pList;
	}
}