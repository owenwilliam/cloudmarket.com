package com.owen.cloudmarket.core.daos;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.owen.cloudmarket.core.entities.Action;


@Repository
public interface ActionRepository  extends JpaRepository<Action, Integer>{
	Page<Action> findAll(Pageable pageable);
}
