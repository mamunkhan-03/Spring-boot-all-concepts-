package com.self.AllConcepts.monitor.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class MonitorDto {


    private Long monitorId;

    private String monitorModel;

    private String monitorCompany;
}
