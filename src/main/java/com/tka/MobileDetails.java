package com.tka;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MobileDetails")
public class MobileDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int mobDetailId;
	
	
	String mobOwnerName;

	public int getMobDetailId() {
		return mobDetailId;
	}

	public void setMobDetailId(int mobDetailId) {
		this.mobDetailId = mobDetailId;
	}

	public String getMobOwnerName() {
		return mobOwnerName;
	}

	public void setMobOwnerName(String mobOwnerName) {
		this.mobOwnerName = mobOwnerName;
	}

	@Override
	public String toString() {
		return "MobileDetails [mobDetailId=" + mobDetailId + ", mobOwnerName=" + mobOwnerName + "]";
	}

	public MobileDetails(String mobOwnerName) {
		super();
		this.mobOwnerName = mobOwnerName;
	}

	public MobileDetails(int mobDetailId, String mobOwnerName) {
		super();
		this.mobDetailId = mobDetailId;
		this.mobOwnerName = mobOwnerName;
	}

	public MobileDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

}
