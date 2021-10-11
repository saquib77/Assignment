package com.mobilephoneapi.mobilephone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobilephoneapi.mobilephone.entity.Phones;
import com.mobilephoneapi.mobilephone.mobiledao.MobileDao;

@Service
public class MobilePhoneServiceImpl implements MobilePhoneService {

	@Autowired
	private MobileDao mobileDao;

	// new
	// SimpleDateFormat("dd/MM/yyyy").parse("20/05/2006").toString().substring(0,
	// 10))

	public MobilePhoneServiceImpl() {}

	@Override
	public List<Phones> getPhones() {
		return this.mobileDao.findAll();
	}

	@Override
	public Phones getPhone(Long phoneId) {
		return this.mobileDao.getById(phoneId);
	}

	@Override
	public Phones addMobile(Phones phone) {
		this.mobileDao.save(phone);
		return phone;
	}

	@Override
	public Phones updatePhone(Phones phone) {
		this.mobileDao.save(phone);
		return phone;
	}

	@Override
	public void deletePhone(Long phoneId) {
		this.mobileDao.deleteById(phoneId);
	}

	@Override
	public void deleteAllPhones() {
		this.mobileDao.deleteAll();

	}

}
