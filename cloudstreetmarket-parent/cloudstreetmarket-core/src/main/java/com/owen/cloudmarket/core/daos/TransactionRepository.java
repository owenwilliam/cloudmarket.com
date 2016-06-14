package com.owen.cloudmarket.core.daos;

import java.util.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

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

	Page<Transaction> findAll(Pageable pageable);
	Iterable<Transaction> findByUser(User user);
	Iterable<Transaction> findTransactions(Date from);
	Iterable<Transaction> findTransactions(int nb);

}
