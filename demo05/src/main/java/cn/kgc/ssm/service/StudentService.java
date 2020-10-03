package cn.kgc.ssm.service;

import cn.kgc.ssm.pojo.Studentinfo;

import java.util.List;

/**
 * @author 李锡良
 * @create 2020-10-02 18:51
 */
public interface StudentService {

    //查询全部
    List<Studentinfo> sList();

    //修改数据
    int upd(Studentinfo studentinfo);

    Studentinfo selId(Integer sid);

}
