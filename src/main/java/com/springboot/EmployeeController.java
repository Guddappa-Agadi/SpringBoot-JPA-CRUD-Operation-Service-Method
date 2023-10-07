package com.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService es;

	@PostMapping("/add")
	public void save(@RequestBody Employee e) {
		es.save(e);
	}

	@PutMapping("/add/{id}")
	public void update(@PathVariable("id") int employee_id,@RequestBody Employee e) {
		es.update(e);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int employee_id) {
		es.delete(employee_id);
	}

	@GetMapping("/get/{id}")
	public Employee getById(@PathVariable int employee_id) {
		return es.getById(employee_id);
	}

	@GetMapping("/get")
	public List<Employee> getAllEmployees() {
		return es.getAllEmployees();
	}

	@GetMapping("/get/page")
	public List<Employee> getByPages(@RequestParam int page,@RequestParam int size,@RequestParam String field) {
		return es.getByPages(page, size, field);
	}
	
}
