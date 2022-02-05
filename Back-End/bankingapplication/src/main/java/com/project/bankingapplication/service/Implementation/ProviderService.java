package com.project.bankingapplication.service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bankingapplication.entity.BillerProvider;
import com.project.bankingapplication.repo.ProviderRepository;



@Service
public class ProviderService {
	@Autowired
	ProviderRepository providerRepository;

	public long createNewProvider(BillerProvider billerProvider) {
		// TODO Auto-generated method stub
		providerRepository.save(billerProvider);
		return billerProvider.getId();
		
	}

	public BillerProvider findBillerProviderById(long id) {
		// TODO Auto-generated method stub
		return providerRepository.findBillerProviderById(id);
	}

}
