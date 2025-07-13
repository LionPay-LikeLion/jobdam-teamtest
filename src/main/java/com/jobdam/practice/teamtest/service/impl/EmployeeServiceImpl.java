package com.jobdam.practice.teamtest.service.impl;

import com.jobdam.practice.teamtest.dto.EmployeeDto;
import com.jobdam.practice.teamtest.entity.Employee;
import com.jobdam.practice.teamtest.mapper.EmployeeMapper;
import com.jobdam.practice.teamtest.repository.EmployeeRepository;
import com.jobdam.practice.teamtest.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}
