package com.owen.cloudmarket.core.daos;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.owen.cloudmarket.core.entities.Market;
import com.owen.cloudmarket.core.entities.Product;

/**
 * 产品仓库
 * 
 * @author OwenWilliam 2016-6-11
 * @since
 * @version v3.x.x
 *
 */
@Repository
public interface ProductRepository<T extends Product> extends JpaRepository<T, String>, JpaSpecificationExecutor<T> {
	
	Page<T> findByMarket(Market marketEntity, Pageable pageable);
	Page<T> findByNameStartingWith(String param, Pageable pageable);
	Page<T> findByNameStartingWith(String param, Specification<T> spec, Pageable pageable);
	
}
