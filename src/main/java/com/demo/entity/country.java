package com.demo.entity;

public class country {
	
	private int countryId;
	private  String countryName;
	private int zipcode ;
	private String address;

	public country(){
	super();
	}

	public country(int countryId,String countryName,int zipcode ,String address ){
	super();
	this.countryId = countryId;
	this.countryName  = countryName;
	this.zipcode  = zipcode;
	this.address =address;
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
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
