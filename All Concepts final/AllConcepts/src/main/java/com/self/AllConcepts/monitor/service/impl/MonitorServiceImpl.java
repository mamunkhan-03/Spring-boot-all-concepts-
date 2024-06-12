package com.self.AllConcepts.monitor.service.impl;

import com.self.AllConcepts.employee.dto.EmployeeDto;
import com.self.AllConcepts.employee.entity.Employee;
import com.self.AllConcepts.monitor.dto.MonitorDto;
import com.self.AllConcepts.monitor.entitiy.Monitor;
import com.self.AllConcepts.monitor.repository.MonitorRepository;
import com.self.AllConcepts.monitor.service.MonitorService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class MonitorServiceImpl implements MonitorService {

    private MonitorRepository monitorRepository;
    private ModelMapper mapper;



    public MonitorServiceImpl(MonitorRepository monitorRepository, ModelMapper mapper) {
        this.monitorRepository = monitorRepository;
        this.mapper=mapper;
    }


    @Override
    public MonitorDto createMonitor(Long empId, MonitorDto monitorDto) {
        return null;
    }




    // map entity to dto
    public MonitorDto mapToDto(Monitor monitor) {
        MonitorDto monitorDto = mapper.map(monitor, MonitorDto.class);
        return monitorDto;
    }

    //map dto to entity
    public Monitor mapToDto(MonitorDto monitorDto) {
        Monitor monitor = mapper.map(monitorDto, Monitor.class);
        return monitor;

    }
}
