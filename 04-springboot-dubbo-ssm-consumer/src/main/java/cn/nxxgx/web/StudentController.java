package cn.nxxgx.web;

import cn.nxxgx.entity.Student;
import cn.nxxgx.service.StudentService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
    @Reference(interfaceName = "cn.nxxgx.service.StudentService",version = "1.0.0",check = false)
    private StudentService studentService;

    @RequestMapping("/student/datails/{name}")
    public @ResponseBody Object findStudentByName(@PathVariable("name") String name){
       Student student = studentService.queryStudentByName(name);
       return student;
    }






}
