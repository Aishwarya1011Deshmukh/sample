package com.tka;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AddressShop {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int shopid;
	String shopLocation;

	public AddressShop() {
		super();
	}

	public AddressShop(int shopid, String shopLocation) {
		super();
		this.shopid = shopid;
		this.shopLocation = shopLocation;
	}

	public AddressShop(String shopLocation) {
		super();
		this.shopLocation = shopLocation;
	}

	@Override
	public String toString() {
		return "AddressShop [shopid=" + shopid + ", shopLocation=" + shopLocation + "]";
	}

	public String getShopLocation() {
		return shopLocation;
	}

	public void setShopLocation(String shopLocation) {
		this.shopLocation = shopLocation;
	}

}
