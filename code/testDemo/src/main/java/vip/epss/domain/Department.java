package vip.epss.domain;


import lombok.Data;

import java.sql.Timestamp;

//类名映射到表名
@Data   //getter,setter, toString
public class Department {
    //成员属性名字映射到   表的字段
    private Integer did;
    private String dname;
    private Timestamp uptime;
}
