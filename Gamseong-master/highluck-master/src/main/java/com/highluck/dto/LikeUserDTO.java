package com.highluck.dto;

public class LikeUserDTO {
   public long userId;
	public String name;
	public long id;
	public long feedId;
	public String feedUserId;
	
	public long getUser_Id() {
		return userId;
	}
	public void setUser_Id(long user_Id) {
		this.userId = user_Id;
	}
	public long getFeed_Id() {
		return feedId;
	}
	public void setFeed_Id(long feed_Id) {
		this.feedId = feed_Id;
	}
	public String getFeed_user_id() {
		return feedUserId;
	}
	public void setFeed_user_id(String feed_user_id) {
		this.feedUserId = feed_user_id;
	}
	public long getUser_id() {
		return userId;
	}
	public void setUser_id(long user_id) {
		this.userId = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getFeed_id() {
		return feedId;
	}
	public void setFeed_id(long feed_id) {
		this.feedId = feed_id;
	}
	

}
