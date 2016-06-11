package com.owen.cloudmarket.core.services;

import java.util.List;

import com.owen.cloudmarket.core.dtos.UserActivityDTO;

public interface ICommunityService
{
	List<UserActivityDTO> getLastUserPublicActivity(int number);
}
