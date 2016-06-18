package com.owen.cloudmarket.core.services;

import org.springframework.social.connect.UsersConnectionRepository;

import com.owen.cloudmarket.core.entities.SocialUser;
import com.owen.cloudmarket.core.entities.User;


public interface SocialUserService extends UsersConnectionRepository {
	SocialUser bindSocialUserToUser(String guid, User user, String provider);
	SocialUser getRegisteredSocialUser(String guid);
	boolean isSocialUserAlreadyRegistered(String guid);
}