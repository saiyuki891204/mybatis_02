package com.cx.mybatis.bean;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("employee")
public class Employee {

    private Integer id;
    private String lastName;
    private String gender;
    private String email;

}
