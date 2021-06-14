package cn.nxxgx.serviceimpl;

import cn.nxxgx.entity.Student;
import cn.nxxgx.mapper.StudentMapper;
import cn.nxxgx.service.StudentService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceName = "cn.nxxgx.service.StudentService",version = "1.0.0",timeout = 15000)
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student queryStudentByName(String name) {
        return studentMapper.selectByPrimaryKey(name);
    }
}
