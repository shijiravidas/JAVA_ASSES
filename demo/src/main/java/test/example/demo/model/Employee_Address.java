package test.example.demo.model;
 

import java.util.Date;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name="employee_address_details")

public class Employee_Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NotEmpty
    @Column(name="add_id")
    private int addid;

    @ManyToOne
    @JoinColumn(name = "emp_id")
    private Employee empid;

    @NotEmpty
    @Column(name="house_name")
    private String housename;

    @NotEmpty
    @Column(name="add_place")
    private String place;

    @NotEmpty
    @Column(name="pincode")
    private String pin;
}
