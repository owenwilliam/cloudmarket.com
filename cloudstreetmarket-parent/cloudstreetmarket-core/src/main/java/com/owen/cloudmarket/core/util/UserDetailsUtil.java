package com.owen.cloudmarket.core.util;
import org.springframework.security.core.userdetails.UserDetails;

import com.owen.cloudmarket.core.enums.Role;


public class UserDetailsUtil {
	
	public static boolean hasRole(UserDetails userDetails, Role role){
		return userDetails.getAuthorities().stream()
			.filter(a -> {
				return a.getAuthority().equals(role.toString());
			})
			.findFirst()
			.isPresent();
	}
}
