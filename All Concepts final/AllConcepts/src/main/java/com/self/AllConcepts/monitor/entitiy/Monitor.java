package com.self.AllConcepts.monitor.entitiy;

import com.self.AllConcepts.employee.entity.Employee;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="monitor_information")
public class Monitor {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name="monitor_id")
    private Long monitorId;

    @Column(name="monitor_model")
    private String monitorModel;

    @Column(name="monitor_company")
    private String monitorCompany;


    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name="emp_id", nullable = false)

    private Employee employee;

}
