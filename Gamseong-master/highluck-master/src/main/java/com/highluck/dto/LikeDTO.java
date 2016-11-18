package com.highluck.dto;

public class LikeDTO {
	public long id;
	public long feedId;
	public String userId;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getFeed_Id() {
		return feedId;
	}
	public void setFeed_Id(long feed_Id) {
		this.feedId = feed_Id;
	}
	public String getUser_Id() {
		return userId;
	}
	public void setUser_Id(String user_Id) {
		this.userId = user_Id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String status;

}
