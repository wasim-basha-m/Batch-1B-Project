package com.project.bankingapplication.service.Implementation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bankingapplication.controller.RegistryController;
import com.project.bankingapplication.entity.BillerProvider;
import com.project.bankingapplication.repo.ProviderRepository;

@Service
public class ProviderService {
	
	Logger logger = LoggerFactory.getLogger(ProviderService.class);
	
	@Autowired
	ProviderRepository providerRepository;

	public long createNewProvider(BillerProvider billerProvider) {
		// TODO Auto-generated method stub
		logger.error("error happened");
		logger.debug("debug needed");
		logger.warn("warning");
		logger.info("infor message");
		providerRepository.save(billerProvider);
		return billerProvider.getId();

	}

	public BillerProvider findBillerProviderById(long id) {
		// TODO Auto-generated method stub
		logger.error("error happened");
		logger.debug("debug needed");
		logger.warn("warning");
		logger.info("infor message");
		return providerRepository.findBillerProviderById(id);
	}

}
