package com.owen.cloudmarket.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.Api;

/**
 * ProductController
 * 
 * @author OwenWilliam 2016-6-14
 * @since
 * @version v4.x.x
 *
 */
@Api(value = "products", description = "Financial products")
// Swagger annotation
@RestController
@RequestMapping(ProductController.PRODUCT_PATH)
public class ProductController extends CloudstreetApiWCI
{

	public static final String PRODUCT_PATH = "/products";

}