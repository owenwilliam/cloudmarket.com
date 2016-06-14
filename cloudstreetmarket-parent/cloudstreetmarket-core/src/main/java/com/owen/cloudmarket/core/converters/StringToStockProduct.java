package com.owen.cloudmarket.core.converters;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.owen.cloudmarket.core.daos.ProductRepository;
import com.owen.cloudmarket.core.entities.StockProduct;

/**
 * 转换器
 * 
 * @author OwenWilliam 20106-6-14
 * @since
 * @version v4.x.x
 *
 */
@Component
public class StringToStockProduct implements Converter<String, StockProduct>
{

	@Autowired
	private ProductRepository<StockProduct> productRepository;

	@Override
	public StockProduct convert(String code)
	{

		StockProduct stock = productRepository.findOne(code);
		if (stock == null)
		{
			throw new NoResultException(
					"No result has been found for the value " + code + " !");
		}

		return stock;
	}
}