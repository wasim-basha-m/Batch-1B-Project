package com.project.bankingapplication.service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bankingapplication.entity.BillerRegister;
import com.project.bankingapplication.repo.RegisterRepository;



@Service
public class RegisterService {
	@Autowired
	RegisterRepository registerRepository;

	public long createNewRegistry(BillerRegister billerRegister) {
		// TODO Auto-generated method stub
		registerRepository.save(billerRegister);
		return billerRegister.getId();
	}

	public BillerRegister findById(long id) {
		// TODO Auto-generated method stub
		return registerRepository.findBillerRegisterById(id);
	}

}
