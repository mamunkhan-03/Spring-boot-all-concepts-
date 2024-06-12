package com.self.AllConcepts.monitor.service;

import com.self.AllConcepts.monitor.dto.MonitorDto;

public interface MonitorService {

    MonitorDto createMonitor (Long empId, MonitorDto monitorDto);
}
