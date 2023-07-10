package test.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import test.example.demo.model.Employee;
import test.example.demo.model.Employee_Address;
import test.example.demo.service.EmployeeService;
import test.example.demo.dto.EmployeeAddressDto;
import test.example.demo.dto.EmployeeDto;

@RestController
@AllArgsConstructor

@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService empservice;

    @PostMapping("/create")
    public ResponseEntity<String> createEmployee( @RequestBody @Valid Employee emp){
        if(emp.getName().isEmpty()  ){
            return   ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("Bad request on validation error\n");
        }
        empservice.SaveEmployee(emp);       
        return   ResponseEntity.status(HttpStatus.CREATED).body("HTTP Status will be CREATED (CODE 201)\n EMPLOYEE ID: "+emp.getEmpid()); 
    }

    @PostMapping("/createaddr")
    public ResponseEntity<String> CreateEmployeeAddress( @RequestBody @Valid Employee_Address empaddr){
        if(empaddr.getHousename().isEmpty()  ){
            return   ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("Bad request on validation error\n");
        }
        empservice.SaveEmployeeAddress(empaddr);       
        return   ResponseEntity.status(HttpStatus.CREATED).body("HTTP Status will be CREATED (CODE 201)\n EMPLOYEE ID: "+emp.getEmpid()); 
    }
    
    
}
