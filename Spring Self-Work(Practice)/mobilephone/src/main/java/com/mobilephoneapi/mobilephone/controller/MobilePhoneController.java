package com.mobilephoneapi.mobilephone.controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.mobilephoneapi.mobilephone.service.MobilePhoneService;
import com.mobilephoneapi.mobilephone.entity.Phones;

@RestController
public class MobilePhoneController {
	
	@Autowired
	private MobilePhoneService mobilePhoneService;
	
	
	//All Mobile Phone
	@GetMapping("/mobile/all")
	public List<Phones> getPhones(){
		return this.mobilePhoneService.getPhones();
	}
	
	
	//Get Particular Phone
	@GetMapping("/mobile/getmobile/{phoneId}")
	public Phones getPhone(@PathVariable String phoneId) {
		return this.mobilePhoneService.getPhone(Long.parseLong(phoneId));
	}

	//Add Mobile Phone
	@PostMapping("/mobile/addphone")
	public Phones addMobile(@RequestBody Phones phone) {
		return this.mobilePhoneService.addMobile(phone);
	}
	
	
	//Update Mobile Phone
	@PutMapping("/mobile/updatephone")
	public Phones updatePhone(@RequestBody Phones phone) {
		return this.mobilePhoneService.updatePhone(phone);
	}
	
	//Delete Mobile Phone
	@DeleteMapping("/mobile/delete/{phoneId}")
	public ResponseEntity<HttpStatus> deletePhone(@PathVariable String phoneId) {
		try{
			this.mobilePhoneService.deletePhone(Long.parseLong(phoneId));
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}catch(Exception e) {
			System.out.println(e);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/mobile/deleteAll")
	public ResponseEntity<HttpStatus> deleteAll() {
		try{
			this.mobilePhoneService.deleteAllPhones();
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}catch(Exception e) {
			System.out.println(e);
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
