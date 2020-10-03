package cn.kgc.ssm.service.impl;

import cn.kgc.ssm.mapper.GoodsMapper;
import cn.kgc.ssm.pojo.Goods;
import cn.kgc.ssm.pojo.GoodsExample;
import cn.kgc.ssm.service.GoodsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 李锡良
 * @create 2020-10-03 16:10
 */
@Transactional
@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {

    @Resource
    GoodsMapper goodsMapper;

    @Override
    public List<Goods> gList(Integer goodsdistrict) {
        GoodsExample example = new GoodsExample();
        GoodsExample.Criteria criteria = example.createCriteria();
        criteria.andGoodsdistrictEqualTo(goodsdistrict);
        List<Goods> goods = goodsMapper.selectByExample(example);
        return goods;
    }

    @Override
    public Goods sel(Integer id) {
        Goods goods = goodsMapper.selectByPrimaryKey(id);
        return goods;
    }

    @Override
    public int upd(Goods goods) {
        int i = goodsMapper.updateByPrimaryKeySelective(goods);
        return i;
    }
}
