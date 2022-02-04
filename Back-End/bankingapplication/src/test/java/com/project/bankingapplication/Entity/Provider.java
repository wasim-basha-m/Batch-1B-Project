package com.project.bankingapplication.Entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.project.bankingapplication.entity.BillerRegister;
import com.project.bankingapplication.repo.RegisterRepository;

@SpringBootTest
public class Provider {

	@Autowired
	RegisterRepository registerRepository;
	
	@Test
	public void create() {
		BillerRegister bReg =new BillerRegister();
		bReg.setBillerName("Airtel");
		bReg.setConsumerNumber(923823);
		registerRepository.save(bReg);
	}
	
	@Test
	public void read() {
		BillerRegister bReg = registerRepository.findById(1L).get();
		assertEquals("Jio",bReg.getBillerName());
	}
	
}
