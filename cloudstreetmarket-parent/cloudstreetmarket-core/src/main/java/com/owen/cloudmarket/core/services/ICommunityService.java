package com.owen.cloudmarket.core.services;

import java.util.List;

import com.owen.cloudmarket.core.dtos.UserActivityDTO;

/**
 * 交流
 * @author OwenWilliam 2016-6-10
 * @since 
 * @version v2.x.x
 *
 */
public interface ICommunityService
{
	List<UserActivityDTO> getLastUserPublicActivity(int number);
}
