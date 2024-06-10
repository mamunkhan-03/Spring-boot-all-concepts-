package com.era.AllConcepts.teamLead.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="team_lead_information")

public class TeamLead {


        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name="team_lead_id")
        private Long teamLeadId;

        @Column(name="team_lead_name")
        private String teamLeadName;

    }


