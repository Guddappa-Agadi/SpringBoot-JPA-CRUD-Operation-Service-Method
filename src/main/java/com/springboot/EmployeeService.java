package com.springboot;

import java.util.List;

public interface EmployeeService {

	public void save(Employee e);
	public void update(Employee e);
	public void delete(int employee_id);
	public Employee getById(int employee_id);
	public List<Employee> getAllEmployees();
	public List<Employee> getByPages(int page, int size, String field);
	
	
}
