package com.ra.model.service;

import com.ra.model.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public List<Employee> findAll() {
        List<Employee> employee = new ArrayList<>();
        employee.add(new Employee(1, "Nguyễn Trường Sơn", "Hà Nội", "0987654321",true));
        employee.add(new Employee(2, "Nguyễn Thị Hải Vân", "Văn Gang", "0987654322",false));
        employee.add(new Employee(3, "Nguyễn Thị Hải Anh", "Hưng Yên", "0987654323",false));
        return employee;
    }

//    @Override
//    public Employee findById(Integer id) {
//        return
//    }
//
//    @Override
//    public void save(Employee employee) {
//
//    }
//
//    @Override
//    public void delete(Integer id) {
//
//    }


}
