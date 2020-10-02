package cn.kgc.ssm.service;

import cn.kgc.ssm.pojo.Bill_Type;

import java.util.List;

/**
 * @author 李锡良
 * @create 2020-10-02 9:54
 */
public interface Bill_TypeService {

    List<Bill_Type> bList();
    List<Bill_Type> bList2(Integer id);

}
