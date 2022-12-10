package vip.epss.dao;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import vip.epss.domain.Department;

import java.util.List;

//@Repository
@Mapper     //将该接口对应的实现类放在IOC容器
public interface DepartmentDao {
    //根据主键获取一个部门的信息 select * from de where did=88
    //可以通过注解方式 将方法和sql语句绑定
    @Select("select * from department where did=#{id}")
    public Department selectByPrimaryKey(Integer id);

    @Select("select * from department")
    public List<Department> selectAll();

    @Insert("insert into department (dname) values ( #{dname} )")
    public Integer insert(Department department);

    @Delete("delete from department where did=#{id}")
    public Integer deleteByPrimaryKey(Integer id);

    @Update("update department set dname=#{dname} where did=#{did}")
    public Integer updateByPrimaryKey(Department department);
}
