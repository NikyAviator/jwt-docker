package ppc.jwtdocker.repository;

import org.springframework.stereotype.Repository;
import ppc.jwtdocker.data.Employee;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryEmployeeRepository {

    private static final List<Employee> DATABASE = new ArrayList<>();

    static {
        DATABASE.add(new Employee(1,"John","Wick","john.wick@gmail.com"));
        DATABASE.add(new Employee(2,"Gustav","Groda","gurra.groda@gmail.com"));
        DATABASE.add(new Employee(3,"Anton","Dalbyman","anton.dalby@gmail.com"));
    }

    // Save an employee
    public Employee addEmployee(Employee employee){
        DATABASE.add(employee);
        return employee;
    }

    // Get employees
    public List<Employee> getAllEmployees(){
        return List.copyOf(DATABASE);
    }

    // Get one employee
    public Employee findById(Integer id){
        return DATABASE.stream().filter(employee -> id.equals(employee.getId())).findFirst().orElseThrow();
    }

    // Update employee
    public Employee updateEmployee(Employee employee){
        Employee employee1= DATABASE.stream().filter(emp -> employee.getId().equals(emp.getId())).findFirst().orElseThrow();
        employee1.setEmail(employee.getEmail());
        employee1.setFirstName(employee.getFirstName());
        employee1.setLastName(employee.getLastName());
        return employee1;
        
    }

    // Delete employee
    public Boolean deleteById(Integer id){
        Employee employee = DATABASE.stream().filter(emp -> id.equals(emp.getId())).findFirst().orElseThrow();
        DATABASE.remove(employee);
        return Boolean.TRUE;
    }
}
