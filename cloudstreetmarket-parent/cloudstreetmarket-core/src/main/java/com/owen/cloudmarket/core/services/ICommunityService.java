package com.owen.cloudmarket.core.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.owen.cloudmarket.core.dtos.UserActivityDTO;

/**
 * 交流
 * 
 * @author OwenWilliam 2016-6-10
 * @since
 * @version v2.x.x
 *
 */
public interface ICommunityService
{
	Page<UserActivityDTO> getPublicActivity(Pageable pageable);
}
