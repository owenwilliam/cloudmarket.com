package com.owen.cloudmarket.core.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 
 * @author OwenWilliam 2016-6-11
 * @since
 * @version v3.x.x
 *
 */
@Entity
@Table(name = "stock_product")
public class StockProduct extends Product implements Serializable
{

	private static final long serialVersionUID = 1620238240796817290L;

}