package com.era.AllConcepts.employee.entity;
;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(
        name = "employee_Information", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"emp_mobile"}),
        @UniqueConstraint(columnNames = {"emp_email"})
}
)

public class Employee {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private Long id;

    @Column(name = "emp_name")
    private String empName;

    @Column(name = "emp_designation")
    private String empDesignation;

    @Column(name = "emp_address")
    private String empAddress;


    @Column(name = "emp_email")
    private String empMail;

    @Column(name = "emp_mobile", nullable = false)
    private String empMobile;

    @Column(name = "emp_salary")
    private Long empSalary;

}



