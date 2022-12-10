package vip.epss;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import vip.epss.dao.DepartmentDao;
import vip.epss.domain.Department;

@SpringBootTest
class TestDemoApplicationTests {

    @Autowired   //自动从IOC容器注入该对象
    private DepartmentDao departmentDao;

    @Test
    void contextLoads() {
    }

    //单元测试的基本思想， 伪装为main执行，
    @Test   //@Test   注解 当前方法， 该方法可以独立执行
    public void selectOne(){
        Department department = departmentDao.selectByPrimaryKey(103);
        System.out.println(department);
    }

    @Test
    public void selectA(){
        for (Department department : departmentDao.selectAll()) {
            System.out.println(department);
        }

    }

}
