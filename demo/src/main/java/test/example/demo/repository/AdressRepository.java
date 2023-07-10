package test.example.demo.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import test.example.demo.model.Employee_Address;

@Repository
public interface AdressRepository extends JpaRepository<Employee_Address ,UUID>  {
    
}
