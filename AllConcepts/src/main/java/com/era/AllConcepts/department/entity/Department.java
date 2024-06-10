package com.era.AllConcepts.department.entity;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(
        name = "department_Information"
)
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="dept_id")
    private Long deptId;

    @Column(name="dept_name")
    private String deptName;

    @Column(name="dept_head")
    private String DeptHead;

    @Column(name="no_of_employees")
    private Long totalEmployee;

    @Column(name="no_of_teams")
    private Long totalTeams;


}
