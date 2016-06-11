package com.owen.cloudmarket.core.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.owen.cloudmarket.core.entities.Transaction;

/**
 * 
 * @author OwenWilliam 2016-6-11
 * @since
 * @version v3.x.x
 *
 */
public interface TransactionRepositoryJpa extends JpaRepository<Transaction, Integer>{
	
	List<Transaction> findAll();
	
}
