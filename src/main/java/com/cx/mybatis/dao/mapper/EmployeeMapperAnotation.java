package com.cx.mybatis.dao.mapper;

import com.cx.mybatis.bean.Employee;
import org.apache.ibatis.annotations.Select;

public interface EmployeeMapperAnotation {

    @Select("select * from tbl_employee where id = #{id}")
    public Employee getEmployeeById(Integer id);
}
