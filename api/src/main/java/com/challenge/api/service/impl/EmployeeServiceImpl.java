package com.challenge.api.service.impl;

import com.challenge.api.model.Employee;
import com.challenge.api.model.EmployeeImpl;
import com.challenge.api.service.EmployeeService;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private List<Employee> employees = new ArrayList<>();

    public EmployeeServiceImpl() {

        Employee employee = new EmployeeImpl();
        employee.setUuid(UUID.randomUUID());
        employee.setFirstName("Abhiraje");
        employee.setLastName("Nimbalkar");
        employee.setFullName("Abhiraje Nimbalkar");
        employee.setSalary(70000);
        employee.setAge(22);
        employee.setJobTitle("Associate Software Engineer");
        employee.setEmail("abhirajenimbalkar1010@gmail.com");
        employee.setContractHireDate(Instant.now());

        employees.add(employee);
    }

    @Override
    public Employee createEmployee(Employee employee) {
        Employee newEmp = new EmployeeImpl();
        newEmp.setUuid(UUID.randomUUID());
        newEmp.setFirstName(employee.getFirstName());
        newEmp.setLastName(employee.getLastName());
        newEmp.setFullName(employee.getFullName());
        newEmp.setSalary(employee.getSalary());
        newEmp.setAge(employee.getAge());
        newEmp.setJobTitle(employee.getJobTitle());
        newEmp.setEmail(employee.getEmail());
        newEmp.setContractHireDate(Instant.now());

        employees.add(newEmp);

        return newEmp;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employees;
    }

    @Override
    public Employee getEmployeeByUuid(UUID uuid) {

        for (Employee emp : employees) {

            if (emp.getUuid().equals(uuid)) return emp;
        }
        return null;
    }
}
