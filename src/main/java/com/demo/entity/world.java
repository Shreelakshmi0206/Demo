package com.demo.entity;

public class world {
	private int worldId;
	private  String countryName;
	private int zipcode ;
	private String address;

	public world(){
	super();
	}

	public world(int worldId,String countryName,int zipcode ,String address ){
	super();
	this.worldId = worldId;
	this.countryName  = countryName;
	this.zipcode  = zipcode;
	this.address =address;
	}

	public int getWorldId() {
		return worldId;
	}

	public void setWorldId(int worldId) {
		this.worldId = worldId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	

}
