package cn.kgc.ssm.service.impl;

import cn.kgc.ssm.mapper.CustomersMapper;
import cn.kgc.ssm.pojo.Credentialtype;
import cn.kgc.ssm.pojo.Customers;
import cn.kgc.ssm.pojo.CustomersExample;
import cn.kgc.ssm.service.CredentialTypeService;
import cn.kgc.ssm.service.CustomersService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 李锡良
 * @create 2020-10-02 12:11
 */
@Transactional
@Service("customersService")
public class CustomersServiceImpl implements CustomersService {

    @Resource
    CustomersMapper customersMapper;

    @Resource
    CredentialTypeService credentialTypeService;

    @Override
    public List<Customers> cList() {
        CustomersExample example = new CustomersExample();
        CustomersExample.Criteria criteria = example.createCriteria();
        List<Customers> customers = customersMapper.selectByExample(example);
        for (Customers customer : customers) {
            List<Credentialtype> credentialtypes = credentialTypeService.cList(customer.getCredentialtypeid());
            customer.setTypeName(credentialtypes.get(0).getName());
        }
        return customers;
    }

    @Override
    public int ins(Customers customers) {
        int i = customersMapper.insertSelective(customers);
        return i;
    }

    @Override
    public int del(Integer id) {
        int i = customersMapper.deleteByPrimaryKey(id);
        return i;
    }
}
