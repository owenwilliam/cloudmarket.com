package com.owen.cloudmarket.core.params;

import java.util.Arrays;
import java.util.List;

/**
 * 排序
 * @author OwenWilliam 2016-6-14
 * @since
 * @version v4.x.x
 *
 */
public class SortDirectionParam{

	List<String> directions;
	
	public SortDirectionParam(String arg){
		this.directions = Arrays.asList(arg.split("#"));
	}

	public List<String> getDirections() {
		return directions;
	}
}
