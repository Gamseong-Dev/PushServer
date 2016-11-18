package com.highluck.dto;

public class DbDTO {
	
	public int id;
	public String userId;
	public String name;
	public String  reciveUserId;
	public String contents;
	public String  status;
	public String creationTimestamp;
	public int feedId;

	public String getCreation_timestamp() {
		return creationTimestamp;
	}
	public int getFeed_id() {
		return feedId;
	}
	public void setFeed_id(int feed_id) {
		this.feedId = feed_id;
	}
	public void setCreation_timestamp(String creation_timestamp) {
		this.creationTimestamp = creation_timestamp;
	}
	public String getRecive_user_id() {
		return reciveUserId;
	}
	public void setRecive_user_id(String recive_user_id) {
		this.reciveUserId = recive_user_id;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser_id() {
		return userId;
	}
	public void setUser_id(String user_id) {
		this.userId = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
