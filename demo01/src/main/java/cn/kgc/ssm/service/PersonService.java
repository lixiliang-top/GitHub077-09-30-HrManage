package cn.kgc.ssm.service;

import cn.kgc.ssm.pojo.Person;

import java.util.List;

/**
 * @author 李锡良
 * @create 2020-09-30 14:20
 */
public interface PersonService {

    //查询学员
    List<Person> pList();

    //添加学员
    int ins(Person person);

    //删除学员
    int del(Integer id);

}
