package test.example.demo.service;

import org.springframework.stereotype.Service;

import test.example.demo.dto.EmployeeAddressDto;
import test.example.demo.dto.EmployeeDto;

@Service
public interface iEmployeeService {
    public void SaveEmployee(EmployeeDto request);
    public void SaveEmployeeAddress(EmployeeAddressDto request);
}
