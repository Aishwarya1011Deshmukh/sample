package com.tka;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Mobile {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int mobId;

	String mobBrandName;
	String mobCost;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "mobDetailId")
	MobileDetails mobiledetails;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "mobId")
	List<AddressShop> addressShops;

	public Mobile(String mobBrandName, String mobCost, ArrayList<AddressShop> addressShops) {
		super();
		this.mobBrandName = mobBrandName;
		this.mobCost = mobCost;
		this.addressShops = addressShops;
	}

	public List<AddressShop> getAddressShops() {
		return addressShops;
	}

	public void setAddressShops(ArrayList<AddressShop> addressShops) {
		this.addressShops = addressShops;
	}

	public Mobile(int mobId, String mobBrandName, String mobCost, MobileDetails details) {
		super();
		this.mobId = mobId;
		this.mobBrandName = mobBrandName;
		this.mobCost = mobCost;
		this.mobiledetails = details;
	}

	public Mobile(String mobBrandName, String mobCost, MobileDetails details) {
		super();
		this.mobBrandName = mobBrandName;
		this.mobCost = mobCost;
		this.mobiledetails = details;
	}

	public MobileDetails getDetails() {
		return mobiledetails;
	}

	public void setDetails(MobileDetails details) {
		this.mobiledetails = details;
	}

	public Mobile(int mobId, String mobBrandName, String mobCost) {
		super();
		this.mobId = mobId;
		this.mobBrandName = mobBrandName;
		this.mobCost = mobCost;
	}

	public Mobile(String mobBrandName, String mobCost) {
		super();
		this.mobBrandName = mobBrandName;
		this.mobCost = mobCost;
	}

	public Mobile() {
		super();
	}

	public int getMobId() {
		return mobId;
	}

	public void setMobId(int mobId) {
		this.mobId = mobId;
	}

	public String getMobBrandName() {
		return mobBrandName;
	}

	public void setMobBrandName(String mobBrandName) {
		this.mobBrandName = mobBrandName;
	}

	public String getMobCost() {
		return mobCost;
	}

	public void setMobCost(String mobCost) {
		this.mobCost = mobCost;
	}

	@Override
	public String toString() {
		return "Mobile [mobId=" + mobId + ", mobBrandName=" + mobBrandName + ", mobCost=" + mobCost + ", details="
				+ mobiledetails + "]";
	}

}
