package ppc.jwtdocker.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ppc.jwtdocker.data.Employee;
import ppc.jwtdocker.repository.JpaEmployeeRepository;
import ppc.jwtdocker.service.EmployeeService;

import java.util.List;

@Service
@RequiredArgsConstructor
@Qualifier(value = "myPostgresEmployeeService")
public class JpaEmployeeServiceImpl implements EmployeeService {

    private final JpaEmployeeRepository jpaEmployeeRepository;

    @Override
    public Employee addEmployee(Employee employee) {
        return jpaEmployeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return jpaEmployeeRepository.findAll();
    }

    @Override
    public Employee findById(Integer id) {
        return jpaEmployeeRepository.findById(id).get();
    }

    // TODO! Ingen aning om detta är korrekt!
    @Override
    public Employee updateEmployee(Employee employee) {
        return null;
    }

    @Override
    public Boolean deleteById(Integer id) {
        jpaEmployeeRepository.deleteById(id);
        return Boolean.TRUE;
    }
}
