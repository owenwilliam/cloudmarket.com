package com.owen.cloudmarket.core.daos;

import java.util.Date;

import com.owen.cloudmarket.core.entities.Transaction;
import com.owen.cloudmarket.core.entities.User;

/**
 * 交易仓库
 * 
 * @author OwenWilliam 2016-6-11
 * @since
 * @version v3.x.x
 *
 */
public interface TransactionRepository
{

	/**
	 * 查找所有的
	 * 
	 * @return
	 */
	Iterable<Transaction> findAll();

	/**
	 * 查找对应用户的
	 * 
	 * @param user
	 * @return
	 */
	Iterable<Transaction> findByUser(User user);

	/**
	 * 查找当前交易的,通过时间
	 * 
	 * @param from
	 * @return
	 */
	Iterable<Transaction> findRecentTransactions(Date from);

	/**
	 * 查找当前交易的通过nb号
	 * 
	 * @param nb
	 * @return
	 */
	Iterable<Transaction> findRecentTransactions(int nb);

}
