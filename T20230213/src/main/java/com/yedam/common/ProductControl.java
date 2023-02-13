package com.yedam.common;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.product.service.ProductService;
import com.yedam.product.service.ProductServiceMybatis;

public class ProductControl implements Command {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String code = req.getParameter("code"); 
		
		ProductService productService = new ProductServiceMybatis();
		req.setAttribute("productrel",productService.relateList());
		req.setAttribute("product", productService.getProduct(code));
		return "product/product.tiles";
	}

}
