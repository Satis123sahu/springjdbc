package com.nit.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.nit.model.Employee;

@Component
public class EmployeeDaoImpl implements EmployeeDao{

	private final String INSERT = "insert into employee(id,name,address,salary) values(?,?,?,?)";
	private final String DELETE = "delete from employee where id=?";
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public void saveemployee(Employee emp) {
		jdbcTemplate.update(INSERT,emp.getId(),emp.getName(),emp.getAddress(),emp.getSalary());
	}

    @Override
	public void updateemployee(Employee emp) {
		
		
	}

    @Override
	public void deleteemployee(Long id) {
		jdbcTemplate.update(DELETE,id);
		
	}


	public Employee getemployee(Long id) {
		// TODO Auto-generated method stub
		return null;
	}


	

}
