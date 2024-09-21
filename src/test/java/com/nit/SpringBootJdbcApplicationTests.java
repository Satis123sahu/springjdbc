package com.nit;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nit.dao.EmployeeDao;
import com.nit.model.Employee;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@SpringBootTest
class SpringBootJdbcApplicationTests {
	@Autowired
	private EmployeeDao employeeDao;
	
	@Test
	void testSaveEmployee() {
		//try {
		Employee emp = new Employee(2l,"Murty", "JNTU", 20060D);
		//for logging we have done this
		//log.info("{} {} {}",emp.getId(),emp.getName(),emp.getAddress(),emp.getSalary());
	    employeeDao.saveemployee(emp);
	    //  int x=12/0;
		//}
		//catch(Exception e) {
		//	log.error(e.getMessage());
		//}
        //employeeDao.deleteemployee(33l);
		//System.out.println("Employee is successfully deleted...");
	}
}
