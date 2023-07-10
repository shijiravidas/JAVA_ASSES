package test.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.validation.Valid;
import test.example.demo.dto.EmployeeAddressDto;
import test.example.demo.dto.EmployeeDto;

import test.example.demo.model.Employee;
import test.example.demo.model.Employee_Address;

@Service
public class EmployeeService implements iEmployeeService{
    @Autowired
    ModelMapper modelmapper;

    @Autowired
    EmployeeDto emprep;

    @Autowired
    EmployeeAddressDto addrep;


    public void SaveEmployee(@Valid Employee emp2) {

        Employee emp = modelmapper.map(emp2, Employee.class);
        emprep.save(emp);

    }

    public void SaveEmployeeAddress(EmployeeAddressDto request) {

        Employee_Address add = modelmapper.map(request, Employee_Address.class);
        addrep.save(add);

    }

    @Override
    public void SaveEmployee(EmployeeDto request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'SaveEmployee'");
    }

     
     
}
