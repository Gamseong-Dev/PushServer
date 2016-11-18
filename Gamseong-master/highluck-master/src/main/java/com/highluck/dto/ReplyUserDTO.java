package com.highluck.dto;

public class ReplyUserDTO {
	public String userId;
	public String name;
	public String contents;
	public long id;
	public long feedId;
	public String feedUserId;
	public String creationTimestamp;
	
	
	
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
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
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
