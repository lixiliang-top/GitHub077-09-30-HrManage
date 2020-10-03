package cn.kgc.ssm.service.impl;

import cn.kgc.ssm.mapper.StudentinfoMapper;
import cn.kgc.ssm.pojo.Studentinfo;
import cn.kgc.ssm.pojo.StudentinfoExample;
import cn.kgc.ssm.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 李锡良
 * @create 2020-10-03 9:02
 */
@Transactional
@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Resource
    StudentinfoMapper studentinfoMapper;

    @Override
    public List<Studentinfo> sList() {
        StudentinfoExample example = new StudentinfoExample();
        StudentinfoExample.Criteria criteria = example.createCriteria();
        List<Studentinfo> studentinfos = studentinfoMapper.selectByExample(example);
        return studentinfos;
    }

    @Override
    public int upd(Studentinfo studentinfo) {
        int i = studentinfoMapper.updateByPrimaryKeySelective(studentinfo);
        return i;
    }

    @Override
    public Studentinfo selId(Integer sid) {
        Studentinfo studentinfo = studentinfoMapper.selectByPrimaryKey(sid);
        return studentinfo;
    }
}
