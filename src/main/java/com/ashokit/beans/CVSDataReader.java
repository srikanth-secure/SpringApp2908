package com.ashokit.beans;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.model.Product;

@Service
public class CVSDataReader {
	// @Autowired
	private ProductService productService;

	@Autowired
	public CVSDataReader(ProductService productService) {
		this.productService = productService;
	}

	public List<Product> readData() throws Exception {
		List<Product> productList = new ArrayList<>();
		FileReader fr = new FileReader(new File("products.txt"));
		BufferedReader br = new BufferedReader(fr);
		String readData = br.readLine();
		while (readData != null) {
			String[] splitData = readData.split(",");
			String pId = splitData[0];
			String pName = splitData[1];
			String pPrice = splitData[2];

			Product p = new Product();
			p.setProductId(Integer.parseInt(pId));
			p.setProductName(pName);
			p.setProductPrice(Double.parseDouble(pPrice));
			productList.add(p);
			readData = br.readLine();

		}
		br.close();
		// List<Product> readProducts=productService.CVSDataReader(productList);
		return productService.CVSDataReader(productList);

	}
}
