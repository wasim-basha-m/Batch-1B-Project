/**
 * Created the Login Form.
 *
 * @author Indhar P
 */

package com.project.bankingapplication.service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.bankingapplication.repo.EmployeeRepository;
import com.project.bankingapplication.entity.Employee;
import com.project.bankingapplication.service.Interfaces.IEmployeeService;

@Service
@Transactional
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	private EmployeeRepository empRepo;
	
	@Override
	public Employee login(String email, String password) {
		Employee employee= empRepo.findByEmailAndPassword(email, password);   // calling customerrepository's method
		if(employee != null)
			return employee;
		else
			return null;
	}

	@Override
	public Employee getEmployee(int id) {
		return empRepo.findById(id).get();
	}
	
	
}
	
