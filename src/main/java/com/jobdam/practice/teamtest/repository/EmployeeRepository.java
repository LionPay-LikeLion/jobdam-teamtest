package com.jobdam.practice.teamtest.repository;

import com.jobdam.practice.teamtest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository <Employee, Long> {
}
