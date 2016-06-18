package com.owen.cloudmarket.core.dtos;

import java.util.Date;

import com.owen.cloudmarket.core.entities.Action;
import com.owen.cloudmarket.core.enums.UserActivityType;
import com.thoughtworks.xstream.annotations.XStreamAlias;


@XStreamAlias("action")
public class ActionDTO {
	
	protected Integer id;
	private String userName;
	private Date date;
	private UserActivityType type;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}

	public UserActivityType getType() {
		return type;
	}
	
	public void setType(UserActivityType type) {
		this.type = type;
	}

	public ActionDTO (Action action){
		this.setId(action.getId());
		this.setDate(action.getDate());
		this.setType(action.getType());
		this.setUserName(action.getUser().getUsername());
	}
}
