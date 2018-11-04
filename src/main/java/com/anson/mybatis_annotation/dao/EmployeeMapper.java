package com.anson.mybatis_annotation.dao;

import com.anson.mybatis_annotation.entity.Employee;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * @Autho
 * @date 2018/11/4
 */
public interface EmployeeMapper {

    @Select("select * from tbl_employee")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "lastName", column = "last_name"),
            @Result(property = "gender", column = "gender"),
            @Result(property = "email", column = "email"),
            })
    List<Employee> queryList();

    @Select("SELECT * FROM USER WHERE id = #{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "lastName", column = "last_name"),
            @Result(property = "gender", column = "gender"),
            @Result(property = "email", column = "email")
    })
    Employee findById(Integer id);

    @Insert("INSERT INTO tbl_employee(last_name,gender) VALUES(#{lastName}, #{gender})")
    int insertParam(@Param("lastName") String lastName, @Param("gender") String gender);

    @Insert("INSERT INTO tbl_employee(last_name, gender) VALUES(#{last_name,jdbcType=VARCHAR}, #{gender,jdbcType=INTEGER})")
    int insertByMap(Map<String, Object> map);

    @Insert("insert into tbl_employee(last_name,gender,email) values(#{last_name},#{gender},#{email})")
    public int insertEntity(Employee employee);

    @Update("UPDATE tbl_employee SET last_name=#{lastName} WHERE id=#{id}")
    int updateEntity(Employee employee);

    @Delete("DELETE FROM tbl_employee WHERE id =#{id}")
    int delete(Integer id);

    @Delete("DELETE FROM tbl_employee WHERE id =#{id}")
    int deleteEntity(Employee employee);
}


