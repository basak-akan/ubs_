package com.ubs.dao;

import java.util.List;

import com.ubs.model.Employee;

public interface EmployeeDao {
	public List<Employee> getAllEmployees();

	public Employee getEmployee(int rollNo);

	public void addEmployee(Employee e);

	public void updateEmployee(Employee e);

	public void deleteEmployee(Employee e);

}
