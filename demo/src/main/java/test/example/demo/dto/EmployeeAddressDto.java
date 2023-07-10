package test.example.demo.dto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeAddressDto {

    private Long id;
    private int addid;
    private int empid;
    private String housename;
    private String place;
    private String pin;
    
}
