package com.owen.cloudmarket.core.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import com.owen.cloudmarket.core.dtos.ProductOverviewDTO;
import com.owen.cloudmarket.core.entities.Product;

/**
 * 
 * @author OwenWilliam 2016-6-14
 *
 * @param <T>
 * @param <U>
 */
public interface IProductService<T extends Product, U extends ProductOverviewDTO> {
	
	Page<U> getProductsOverview(String startWith, Specification<T> spec, Pageable pageable);
	
}
