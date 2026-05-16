package com.challenge.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.challenge.api.model.Employee;
import com.challenge.api.model.EmployeeImpl;
import com.challenge.api.service.impl.EmployeeServiceImpl;

public class EmployeeControllerTest {
    
    @Test
    public void empCreationTest(){

        EmployeeServiceImpl emp = new EmployeeServiceImpl();
        EmployeeImpl emp1 = new EmployeeImpl();
        emp1.setFirstName("Raj");
        EmployeeImpl res = (EmployeeImpl)emp.createEmployee(emp1);

         assertEquals("Raj",res.getFirstName());

    }
}
