package com.springboot;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository er;

	@Override
	public void save(Employee e) {
		er.save(e);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Employee e) {
		er.save(e);
		// TODO Auto-generated method stub
		
	}

	public void delete(int employee_id) {
		er.deleteById(employee_id);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee getById(int employee_id) {
		Optional<Employee> obj = er.findById(employee_id);
		if(obj.isPresent()) {
			return obj.get();
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		Iterable<Employee> irt = er.findAll();
		List<Employee> lst = new ArrayList<Employee>();
		irt.forEach(ele->lst.add(ele));
		// TODO Auto-generated method stub
		return lst;
	}

	@Override
	public List<Employee> getByPages(int page, int size, String field) {
		Pageable p = PageRequest.of(page, size, Direction.ASC, field);
		// TODO Auto-generated method stub
		return er.findAll(p).toList();
	}

	
	
	
}
