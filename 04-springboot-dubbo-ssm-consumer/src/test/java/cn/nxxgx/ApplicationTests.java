package cn.nxxgx;

import cn.nxxgx.entity.Student;
import cn.nxxgx.web.StudentController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {
   @Autowired
    private StudentController studentController;

    @Test
    void contextLoads() {
    }

    @Test
    public void testSc(){
        Student student = (Student) studentController.findStudentByName("lixue");
        System.out.println(student);
    }


}
