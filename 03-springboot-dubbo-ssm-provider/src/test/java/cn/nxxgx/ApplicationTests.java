package cn.nxxgx;

import cn.nxxgx.entity.Student;
import cn.nxxgx.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    @Autowired
    private StudentService studentService;

    @Test
    void contextLoads() {
    }
    @Test
    public void test01(){
        Student student = studentService.queryStudentByName("lixue");
        System.out.println(student);
    }

}
