package vip.epss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.epss.dao.DepartmentDao;
import vip.epss.domain.Department;

//应该通过接口提供低耦合的交互方式， 客户端可以任意，通用形式 JSON数据
@RestController     //返回用户的是json   @Controller+@ResponseBody
@RequestMapping("departments")  //  映射url地址到该类  http://localhost/departments
public class DepartmentController {
    @Autowired   //自动注入
    private DepartmentDao departmentDao;

    @GetMapping      //代表用户通过http的get方法访问时   http://localhost/departments
    public String test01(){
       return  departmentDao.selectAll().toString();
    }

    @GetMapping("/{did}")      //代表用户通过http的get方法访问时   http://localhost/departments/106
    public String test02(@PathVariable(value = "did")Integer newdid){
        return  departmentDao.selectByPrimaryKey(newdid).toString();
    }

    @PostMapping
    public String test03(Department department){
        return departmentDao.insert(department).toString();
    }

    @DeleteMapping("/{did}")
    public String test04(@PathVariable(value = "did")Integer newdid){
        return departmentDao.deleteByPrimaryKey(newdid).toString();
    }

    @PutMapping
    public String test05(Department department){
        return departmentDao.updateByPrimaryKey(department).toString();
    }

}


