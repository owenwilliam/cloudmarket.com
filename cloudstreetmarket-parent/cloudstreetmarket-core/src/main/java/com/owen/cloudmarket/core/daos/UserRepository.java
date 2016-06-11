package com.owen.cloudmarket.core.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.owen.cloudmarket.core.entities.User;

/**
 * 用户仓库
 * 
 * @author OwenWilliam 2016-6-11
 * @since
 * @version v3.x.x
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, String>
{
	/**
	 * 通过用户名找用户
	 * 
	 * @param username
	 * @return
	 */
	User findByUserName(String username);

	/**
	 * 通过用户名和用户密码找用户
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	User findByUserNameAndPassword(String username, String password);

}
