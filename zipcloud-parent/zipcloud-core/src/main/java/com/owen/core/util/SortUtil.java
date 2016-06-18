package com.owen.core.util;

import java.util.LinkedList;
import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;

/**
 * 排序的公用 
 * @author OwenWilliam 2016-6-14
 * @since
 * @version v4.x.x
 *
 */
public class SortUtil {
	
	public static Sort buildSort(List<String> fields, List<String> directions){
		List<Order> result = new LinkedList<>();
		
		for (int i = 0; i < fields.size(); i++) {
			if(directions.get(i) == null){
				result.add(new Order(fields.get(i)));
			}
			else{
				result.add(new Order(Direction.fromString(directions.get(i)), fields.get(i)));
			}
		}
		return new Sort(result);
	}
}
