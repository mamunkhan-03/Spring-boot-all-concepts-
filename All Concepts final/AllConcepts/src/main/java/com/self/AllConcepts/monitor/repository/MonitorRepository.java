package com.self.AllConcepts.monitor.repository;

import com.self.AllConcepts.monitor.entitiy.Monitor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonitorRepository extends JpaRepository<Monitor, Long> {
}
