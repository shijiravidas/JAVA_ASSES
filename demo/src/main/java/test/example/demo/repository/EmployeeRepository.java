package test.example.demo.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import test.example.demo.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee ,UUID>  {
    
}
