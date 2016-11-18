package com.highluck.dto;

public class AlarmDTO {
	public long id;
	public String userId;
	public String contents;
	public String sendTimestamp;
	public String type;
	public long typeId;

	
	
	

	

	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getType_id() {
		return typeId;
	}
	public void setType_id(long type_id) {
		this.typeId = type_id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSend_timestamp() {
		return sendTimestamp;
	}
	public void setSend_timestamp(String send_timestamp) {
		this.sendTimestamp = send_timestamp;
	}
	
	public long getId() {
		return id;
	}
	public String getUser_id() {
		return userId;
	}
	public void setUser_id(String user_id) {
		this.userId = user_id;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}

}