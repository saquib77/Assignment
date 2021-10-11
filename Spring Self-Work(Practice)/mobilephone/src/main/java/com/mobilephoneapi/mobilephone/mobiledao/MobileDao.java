package com.mobilephoneapi.mobilephone.mobiledao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.mobilephoneapi.mobilephone.entity.Phones;

public interface MobileDao extends JpaRepository<Phones, Long>{
	
}

