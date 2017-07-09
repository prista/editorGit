package com.example.employees;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
/**
 *
 * create a user interface to search the employees that match the name or last name.
 */

public class EmployeeService {

	List<Employee> employeeList = EmployeeList.getInstance();
	//Get all employees.

	
	public List<Employee> getAllEmployees() {
		return employeeList;
	}

	//Get all employees whose Name or Last Name match the searchParam, order by name and last name.
	public List<Employee> searchEmployeesByName(String name) {
		Comparator<Employee> groupByComparator = Comparator.comparing(Employee::getName)
				.thenComparing(Employee::getLastName);
		List<Employee> result = employeeList
				.stream()
				.filter(e -> e.getName().equalsIgnoreCase(name) || e.getLastName().equalsIgnoreCase(name))
				.sorted(groupByComparator)
				.collect(Collectors.toList());
		return result;
	}

	//Get the employee by id
	public Employee getEmployee(long id) throws Exception {
		Optional<Employee> match
				= employeeList.stream()
				.filter(e -> e.getId() == id)
				.findFirst();
		if (match.isPresent()) {
			return match.get();
		} else {
			throw new Exception("The Employee id " + id + " not found");
		}
	}

}