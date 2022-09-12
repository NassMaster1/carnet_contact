package com.lip6.entities.EntityContactGroup;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ContactGroup {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long groupId;
	private String groupName;
	
	
	
	public ContactGroup(String groupName) {
		super();
		this.groupName = groupName;
	}
	
	public ContactGroup() {
		
	}
	
	
	public long getGroupId() {
		return groupId;
	}
	
	
	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}
	
	public String getGroupName() {
		return groupName;
	}
	
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	
	

}
