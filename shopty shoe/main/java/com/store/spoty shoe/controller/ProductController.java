package com.store.happyHeels.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.store.happyHeels.service.ProductService;

@RestController
public class ProductController {

		@Autowired
		private ProductService productService;
}
