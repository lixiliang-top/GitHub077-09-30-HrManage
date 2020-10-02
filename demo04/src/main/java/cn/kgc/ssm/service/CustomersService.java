package cn.kgc.ssm.service;

import cn.kgc.ssm.pojo.Customers;

import java.util.List;

/**
 * @author 李锡良
 * @create 2020-10-02 12:06
 */
public interface CustomersService {

    //查询全部信息
    List<Customers> cList();

    //添加实体类
    int ins(Customers customers);

    //删除
    int del(Integer id);

}
