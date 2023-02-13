package com.yedam.common;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.yedam.product.service.ProductService;
import com.yedam.product.service.ProductServiceMybatis;
import com.yedam.product.vo.ProductVO;

public class MainControl implements Command {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	
			
		
		return "main/main.tiles";
	}

	}
