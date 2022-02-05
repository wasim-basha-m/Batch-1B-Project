/**
 * Created the Login Form.
 *
 * @author Indhar P
 */

package com.project.bankingapplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.bankingapplication.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	Employee findByEmailAndPassword(String email,String password);
}
