package cn.kgc.ssm.service;

import cn.kgc.ssm.pojo.Bills;

import java.util.List;

/**
 * @author 李锡良
 * @create 2020-10-02 9:55
 */
public interface BillsService {

    List<Bills> bList(Integer type_id);

    int ins(Bills bills);

}
