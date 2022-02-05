package com.project.bankingapplication.service.Implementation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bankingapplication.controller.RegistryController;
import com.project.bankingapplication.entity.BillerRegister;
import com.project.bankingapplication.repo.RegisterRepository;



@Service
public class RegisterService {
	
	Logger logger = LoggerFactory.getLogger(RegisterService.class);
	
	@Autowired
	RegisterRepository registerRepository;

	public long createNewRegistry(BillerRegister billerRegister) {
		// TODO Auto-generated method stub
		logger.error("error happened");
    	logger.debug("debug needed");
    	logger.warn("warning");
    	logger.info("infor message");
		registerRepository.save(billerRegister);
		return billerRegister.getId();
	}

	public BillerRegister findById(long id) {
		// TODO Auto-generated method stub
		logger.error("error happened");
    	logger.debug("debug needed");
    	logger.warn("warning");
    	logger.info("infor message");
		return registerRepository.findBillerRegisterById(id);
	}

}
