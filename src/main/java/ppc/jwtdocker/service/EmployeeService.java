package ppc.jwtdocker.service;

import ppc.jwtdocker.data.Employee;

import java.util.List;

// We start our project here, to define what we want to do (functionality)
public interface EmployeeService {

    // Save an employee
    void addEmployee(Employee employee);

    // Get employees
    List<Employee> getAllEmployees();

    // Get one employee
    Employee findById(Integer id);

    // Update employee
    void updateEmployee(Employee employee);

    // Delete employee
    Boolean deleteById(Integer id);
}


