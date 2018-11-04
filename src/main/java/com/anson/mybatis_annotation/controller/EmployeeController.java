package com.anson.mybatis_annotation.controller;

import com.anson.mybatis_annotation.entity.Employee;
import com.anson.mybatis_annotation.service.EmployeeService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Autho
 * @date 2018/11/4
 */
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @RequestMapping("/employeeList")
    public List<Employee> queryList(){
        PageHelper.startPage(1, 2);
        return employeeService.queryList();
    }

    @RequestMapping("/queryEmployee")
    public Employee queryUserEntity(Integer id){
        Employee employee=employeeService.findById(id);
        return employee;
    }

    @RequestMapping("/insert")
    public int insertEntity() {
        return employeeService.insertEntity();
    }

    @RequestMapping("/insertParam")
    public int insertParam() {
        return employeeService.insertParam();
    }

    @RequestMapping("/insertByMap")
    public int insertByMap() {
        return employeeService.insertByMap();
    }

    @RequestMapping("/updateEntity")
    public int updateEntity() {
        return employeeService.updateEntity();
    }

    @RequestMapping("/deleteEntity")
    public int deleteEntity() {
        return employeeService.deleteEntity();
    }
}
