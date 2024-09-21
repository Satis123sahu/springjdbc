package com.nit.dao;

import com.nit.model.Employee;

public interface EmployeeDao {
	void saveemployee(Employee emp);
	void updateemployee(Employee emp);
	void deleteemployee(Long id);
	Employee getemployee(Long id);
}
