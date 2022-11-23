package ppc.jwtdocker.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ppc.jwtdocker.data.Employee;
import ppc.jwtdocker.repository.InMemoryEmployeeRepository;
import ppc.jwtdocker.service.EmployeeService;

import java.util.List;
@RequiredArgsConstructor
@Service
public class InMemoryEmployeeServiceImpl implements EmployeeService {
    private final InMemoryEmployeeRepository inMemoryEmployeeRepository;

    @Override
    public Employee addEmployee(Employee employee) {
        return inMemoryEmployeeRepository.addEmployee(employee);

    }

    @Override
    public List<Employee> getAllEmployees() {
        return inMemoryEmployeeRepository.getAllEmployees();
    }

    @Override
    public Employee findById(Integer id) {
        return inMemoryEmployeeRepository.findById(id);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return inMemoryEmployeeRepository.updateEmployee(employee);
    }

    @Override
    public Boolean deleteById(Integer id) {
        return inMemoryEmployeeRepository.deleteById(id);
    }
}
