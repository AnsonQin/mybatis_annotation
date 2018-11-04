package com.anson.mybatis_annotation.service;

import com.anson.mybatis_annotation.dao.EmployeeMapper;
import com.anson.mybatis_annotation.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Autho
 * @date 2018/11/4
 */

@Service
public class EmployeeService {

    @Autowired(required = false)
    private EmployeeMapper mapper;

    public List<Employee> queryList(){
        List<Employee> employeeList=mapper.queryList();
        return employeeList;
    }

    public Employee findById(Integer id){
        System.out.println("id:"+id);
        return mapper.findById(id);
    }

    public int insertEntity() {
        Employee employee=new Employee();
        employee.setLast_name("lisi");
        employee.setGender("男");
        employee.setEmail("qq@qq.com");

        return mapper.insertEntity(employee);
    }

    public int insertParam() {
        return mapper.insertParam("linzhiqiang","lzq");
    }

    public int insertByMap() {
        Map<String, Object> map=new HashMap<String, Object>();
        map.put("nickName","zhaotong");
        map.put("userCode","zt");
        return mapper.insertByMap(map);
    }

    public int updateEntity() {
        Employee employee=new Employee();
        employee.setId(1);
        employee.setLast_name("郭靖");
        return mapper.updateEntity(employee);
    }

    public int deleteEntity() {
        Employee employee=new Employee();
        employee.setId(1);
        return mapper.deleteEntity(employee);
    }



}
