package cn.kgc.ssm.service;

import cn.kgc.ssm.pojo.Goods;

import java.util.List;

/**
 * @author 李锡良
 * @create 2020-10-03 16:08
 */
public interface GoodsService {

    List<Goods> gList(Integer goodsdistrict);

    Goods sel(Integer id);

    int upd(Goods goods);

}
