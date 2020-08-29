package com.ashokit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.beans.CVSDataReader;
import com.ashokit.beans.CVSDataWriter;
import com.ashokit.beans.productsDataFilter;
import com.ashokit.model.Product;

@SpringBootApplication
public class SpringAppAssignmentApplication {

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringAppAssignmentApplication.class, args);

		CVSDataReader cvsDataReader = ctx.getBean(CVSDataReader.class);
		List<Product> readData = cvsDataReader.readData();

		productsDataFilter pDataFilter = ctx.getBean(productsDataFilter.class);
		List<Product> filterData = pDataFilter.filterData(readData);

		for (Product p : filterData) {
			System.out.println(p);
		}
		CVSDataWriter cvsDataWriter = ctx.getBean(CVSDataWriter.class);
		cvsDataWriter.filterData(filterData);
	}

}
