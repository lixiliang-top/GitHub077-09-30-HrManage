package cn.kgc.ssm.service.impl;

import cn.kgc.ssm.mapper.PersonMapper;
import cn.kgc.ssm.pojo.Person;
import cn.kgc.ssm.pojo.PersonExample;
import cn.kgc.ssm.service.PersonService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 李锡良
 * @create 2020-09-30 14:21
 */
@Transactional
@Service("personService")
public class PersonServiceImpl implements PersonService {

    @Resource
    PersonMapper personMapper;

    @Override
    public List<Person> pList() {
        PersonExample example = new PersonExample();
        PersonExample.Criteria criteria = example.createCriteria();
        List<Person> people = personMapper.selectByExample(example);
        return people;
    }

    @Override
    public int ins(Person person) {
        int i = personMapper.insertSelective(person);
        return i;
    }

    @Override
    public int del(Integer id) {
        int i = personMapper.deleteByPrimaryKey(id);
        return i;
    }
}
