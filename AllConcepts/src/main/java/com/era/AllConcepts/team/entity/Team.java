package com.era.AllConcepts.team.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name="team_information")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="team_id")
    private Long teamId;

    @Column(name="team_name")
    private String teamName;

    @Column(name="team_lead")
    private String teamHead;

    @Column(name="no_of_employee")
    private Long totalEmployee;

}
