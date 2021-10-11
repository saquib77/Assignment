package com.mobilephoneapi.mobilephone.service;

import java.util.List;

import com.mobilephoneapi.mobilephone.entity.Phones;

public interface MobilePhoneService {
	public List<Phones> getPhones();
	public Phones getPhone(Long phoneId);
	public Phones addMobile(Phones phone);
	public Phones updatePhone(Phones phone);
	public void deletePhone(Long phoneId);
	public void deleteAllPhones();
}
