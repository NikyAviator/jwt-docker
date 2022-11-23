package ppc.jwtdocker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ppc.jwtdocker.data.Employee;

@Repository
public interface JpaEmployeeRepository extends JpaRepository<Employee, Integer> {


    // Define more if need be
}
