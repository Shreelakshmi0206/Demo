package com.demo.entity;

public class usa{
	
	
	private int stateId;
	private  String districtName;
	private int zipcode ;
	private String address;

	public usa(){
	super();
	}

	public usa(int countryId,String districtName,int zipcode ,String address ){
	super();
	this.stateId = stateId;
	this.districtName  = districtName;
	this.zipcode  = zipcode;
	this.address =address;
	}

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
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
