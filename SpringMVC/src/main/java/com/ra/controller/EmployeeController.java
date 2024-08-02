package com.ra.controller;

import com.ra.model.entity.Employee;
import com.ra.model.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller

public class EmployeeController {
    //@getMapping(chỉ nhận các request là get)
    //@postMapping(chỉ nhận ca request là post)
    //Http Get : URL, thẻ a, form (get)
    //Http Post : from Post, XMLHTTPRequest js
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/employee")
    public String employee(Model model) {
        List<Employee> employee = employeeService.findAll();
        model.addAttribute("employees", employee);
        return "employee";
    }
}
