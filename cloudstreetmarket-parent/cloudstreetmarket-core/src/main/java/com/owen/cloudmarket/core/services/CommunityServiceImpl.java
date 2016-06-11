package com.owen.cloudmarket.core.services;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.owen.cloudmarket.core.daos.TransactionRepository;
import com.owen.cloudmarket.core.dtos.UserActivityDTO;
import com.owen.cloudmarket.core.enums.Action;

/**
 * 
 * @author OwenWilliam 2016-6-11
 * @since
 * @version v3.x.x
 *
 */

@Service(value = "communityServiceImpl")
public class CommunityServiceImpl implements ICommunityService
{

	@Autowired
	private TransactionRepository transactionRepository;

	@Override
	public List<UserActivityDTO> getLastUserPublicActivity(int number)
	{

		List<UserActivityDTO> result = new LinkedList<UserActivityDTO>();
		transactionRepository.findRecentTransactions(number)
				.forEach(
						transaction -> result.add(new UserActivityDTO(
								transaction.getUser().getLoginName(),
								transaction.getUser().getProfileImg(),
								transaction.getType(), transaction.getQuote()
										.getStock().getCode(), transaction
										.getQuantity(), transaction.getType()
										.equals(Action.BUY) ? new BigDecimal(
										transaction.getQuote().getAsk())
										: new BigDecimal(transaction.getQuote()
												.getBid()), transaction
										.getQuote().getDate())));

		return result;
	}

}
