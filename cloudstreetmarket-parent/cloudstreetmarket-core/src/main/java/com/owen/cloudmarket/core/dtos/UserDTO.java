package com.owen.cloudmarket.core.dtos;

import java.util.Set;
import java.util.stream.Collectors;

import com.owen.cloudmarket.core.entities.Action;
import com.owen.cloudmarket.core.entities.User;
import com.owen.cloudmarket.core.enums.SupportedCurrency;
import com.thoughtworks.xstream.annotations.XStreamAlias;


@XStreamAlias("activity")
public class UserDTO {
	
	private String username;
	private String fullname;
	private String profileImg;
	private SupportedCurrency currency;
	private Set<ActionDTO> actions;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getProfileImg() {
		return profileImg;
	}
	public void setProfileImg(String profileImg) {
		this.profileImg = profileImg;
	}
	public SupportedCurrency getCurrency() {
		return currency;
	}
	public void setCurrency(SupportedCurrency currency) {
		this.currency = currency;
	}
	
	public Set<ActionDTO> getActions(Set<Action> actions) {
		return this.actions;
	}
	
	public void setActions(Set<Action> actions) {
		this.actions = actions.stream()
				.map(ActionDTO::new)
				.collect(Collectors.toSet());
	}
	
	public UserDTO (User user){
		this.setFullname(user.getFullName());
		this.setProfileImg(user.getProfileImg());
		this.setUsername(user.getUsername());
		this.setCurrency(user.getCurrency());
		this.setActions(user.getActions());
	}
}
