package cn.kgc.ssm.service.impl;

import cn.kgc.ssm.mapper.Bill_TypeMapper;
import cn.kgc.ssm.pojo.Bill_Type;
import cn.kgc.ssm.pojo.Bill_TypeExample;
import cn.kgc.ssm.service.Bill_TypeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 李锡良
 * @create 2020-10-02 9:57
 */
@Transactional
@Service("bill_TypeService")
public class Bill_TypeServiceImpl implements Bill_TypeService {

    @Resource
    Bill_TypeMapper bill_typeMapper;

    @Override
    public List<Bill_Type> bList() {
        Bill_TypeExample example = new Bill_TypeExample();
        Bill_TypeExample.Criteria criteria = example.createCriteria();
        List<Bill_Type> bill_types = bill_typeMapper.selectByExample(example);
        return bill_types;
    }

    @Override
    public List<Bill_Type> bList2(Integer id) {
        Bill_TypeExample example = new Bill_TypeExample();
        Bill_TypeExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        List<Bill_Type> bill_types = bill_typeMapper.selectByExample(example);
        return bill_types;
    }
}
