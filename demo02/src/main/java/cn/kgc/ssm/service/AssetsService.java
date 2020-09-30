package cn.kgc.ssm.service;

import cn.kgc.ssm.pojo.Assets;

import java.util.List;

/**
 * @author 李锡良
 * @create 2020-09-30 15:09
 */
public interface AssetsService {

    //条件查询数据
    List<Assets> aList(String assetsid,String assetstype);

    //添加数据
    int ins(Assets assets);
}
