package com.mobilephoneapi.mobilephone.entity;

import javax.persistence.*;

@Entity
public class Phones {
	
	@Id
	private Long phoneId;
	private String phoneBrand;
	private String phoneModel;
	private String phoneVariant;
	private double phonePrice;
	private boolean phoneAvailbility;
	private String phoneLaunchDate;
	
	//Phone Constructor
	public Phones(Long phoneId,String phoneBrand, String phoneModel, String phoneVariant, double phonePrice,
			boolean phoneAvailbility, String phoneLaunchDate) {
		super();
		this.phoneId =phoneId;
		this.phoneBrand = phoneBrand;
		this.phoneModel = phoneModel;
		this.phoneVariant = phoneVariant;
		this.phonePrice = phonePrice;
		this.phoneAvailbility = phoneAvailbility;
		this.phoneLaunchDate = phoneLaunchDate;
	}
	//Phone Default Constructor
	public Phones() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// Getters
	public Long getPhoneId() {
		return phoneId;
	}
	public String getPhoneBrand() {
		return phoneBrand;
	}
	public String getPhoneModel() {
		return phoneModel;
	}
	public String getPhoneVariant() {
		return phoneVariant;
	}
	public double getPhonePrice() {
		return phonePrice;
	}
	public boolean getPhoneAvailbility() {
		return phoneAvailbility;
	}
	public String getPhoneLaunchDate() {
		return phoneLaunchDate;
	}
	
	
	//Setters
	public void setPhoneId(Long phoneId) {
		this.phoneId = phoneId;
	}
	public void setPhoneBrand(String phoneBrand) {
		this.phoneBrand = phoneBrand;
	}
	public void setPhoneModel(String phoneModel) {
		this.phoneModel = phoneModel;
	}
	public void setPhoneVariant(String phoneVariant) {
		this.phoneVariant = phoneVariant;
	}
	public void setPhonePrice(double phonePrice) {
		this.phonePrice = phonePrice;
	}
	public void setPhoneAvailbility(boolean phoneAvailbility) {
		this.phoneAvailbility = phoneAvailbility;
	}
	public void setPhoneLaunchDate(String phoneLaunchDate) {
		this.phoneLaunchDate = phoneLaunchDate;
	}
	
	
	
	@Override
	public String toString() {
		return "Phones [phoneId=" + phoneId + ", phoneBrand=" + phoneBrand + ", phoneModel=" + phoneModel
				+ ", phoneVariant=" + phoneVariant + ", phonePrice=" + phonePrice + ", phoneAvailbility="
				+ phoneAvailbility + ", phoneLaunchDate=" + phoneLaunchDate + "]";
	}
	
	
	
	
	
	
	
}
