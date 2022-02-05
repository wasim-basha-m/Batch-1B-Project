package com.project.bankingapplication.service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bankingapplication.entity.BillerStatement;
import com.project.bankingapplication.repo.StatementRepository;



@Service
public class StatementService {
	
	@Autowired
	StatementRepository statementRepository;

	public List<BillerStatement> listAllBillerStatement() {
		// TODO Auto-generated method stub
		return statementRepository.findAll();
	}

}
