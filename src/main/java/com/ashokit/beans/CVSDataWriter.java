package com.ashokit.beans;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.model.Product;

@Service
public class CVSDataWriter {
	private ProductService productService;

	@Autowired
	public CVSDataWriter(ProductService productService) {
		this.productService = productService;
	}

	public void filterData(List<Product> product) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(new File("filteredproducts.txt")));
		for(Object str: product.toArray()) {
			 writer.write(str + System.lineSeparator());
		}
		//String stuffToWrite = info;

		//writer.write(stuffToWrite);

		writer.close();
		/*
		 * FileWriter writer = new FileWriter("output.txt"); for(String str: arr) {
		 * writer.write(str + System.lineSeparator()); } writer.close();
		 */
		//return 0;
	}
}
