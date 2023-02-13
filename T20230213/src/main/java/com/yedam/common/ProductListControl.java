package com.yedam.common;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.product.service.ProductService;
import com.yedam.product.service.ProductServiceMybatis;

public class ProductListControl implements Command {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ProductService productService = new ProductServiceMybatis();
		req.setAttribute("product",productService.productList());	
		
		
		return "product/productList.tiles";
	}

}
