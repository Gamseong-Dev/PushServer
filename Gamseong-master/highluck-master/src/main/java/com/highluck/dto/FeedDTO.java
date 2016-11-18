package com.highluck.dto;

public class FeedDTO {
	
	public long id;
	public String locationId;
	public String userId;
	public String contents;
	public String creationTimestamp;
	public long likeCount;
	public long replyCount;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLocation_Id() {
		return locationId;
	}
	public void setLocation_Id(String location_Id) {
		this.locationId = location_Id;
	}
	public String getUser_Id() {
		return userId;
	}
	public void setUser_Id(String user_Id) {
		this.userId = user_Id;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getCreation_Timestamp() {
		return creationTimestamp;
	}
	public void setCreation_Timestamp(String creation_Timestamp) {
		this.creationTimestamp = creation_Timestamp;
	}
	public long getLike_Count() {
		return likeCount;
	}
	public void setLike_Count(long like_Count) {
		this.likeCount = like_Count;
	}
	public long getReply_Count() {
		return replyCount;
	}
	public void setReply_Count(long reply_Count) {
		this.replyCount = reply_Count;
	}

}
