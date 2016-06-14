package com.owen.cloudmarket.core.services;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.owen.cloudmarket.core.dtos.UserActivityDTO;
import com.owen.cloudmarket.core.enums.Action;

/**
 * 
 * @author OwenWilliam 2016-6-11
 * @since
 * @version v3.x.x
 *
 */
@Service
public class DummyCommunityServiceImpl implements ICommunityService
{
	@Override
	public Page<UserActivityDTO> getPublicActivity(Pageable pageable)
	{
		return null;
	}

}
