package cn.kgc.ssm.service.impl;

import cn.kgc.ssm.mapper.BillsMapper;
import cn.kgc.ssm.pojo.Bill_Type;
import cn.kgc.ssm.pojo.Bills;
import cn.kgc.ssm.pojo.BillsExample;
import cn.kgc.ssm.service.Bill_TypeService;
import cn.kgc.ssm.service.BillsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 李锡良
 * @create 2020-10-02 9:58
 */
@Transactional
@Service("billService")
public class BillsServiceImpl implements BillsService {

    @Resource
    BillsMapper billsMapper;

    @Resource
    Bill_TypeService bill_typeServicel;

    @Override
    public List<Bills> bList(Integer type_id) {
        BillsExample example = new BillsExample();
        BillsExample.Criteria criteria = example.createCriteria();
        if (type_id!=0){
            criteria.andTypeIdEqualTo(type_id);
        }
        List<Bills> bills = billsMapper.selectByExample(example);
        for (Bills bill : bills) {
            List<Bill_Type> bill_types = bill_typeServicel.bList2(bill.getTypeId());
            bill.setBname(bill_types.get(0).getBname());
        }
        return bills;
    }

    @Override
    public int ins(Bills bills) {
        int i = billsMapper.insertSelective(bills);
        return i;
    }
}
