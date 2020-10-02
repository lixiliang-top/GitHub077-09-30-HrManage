package cn.kgc.ssm.service.impl;

import cn.kgc.ssm.mapper.CredentialtypeMapper;
import cn.kgc.ssm.pojo.Credentialtype;
import cn.kgc.ssm.pojo.CredentialtypeExample;
import cn.kgc.ssm.service.CredentialTypeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 李锡良
 * @create 2020-10-02 12:08
 */
@Transactional
@Service("credentialTypeService")
public class CredentialTypeServiceImpl implements CredentialTypeService {

    @Resource
    CredentialtypeMapper credentialtypeMapper;

    @Override
    public List<Credentialtype> cList() {
        CredentialtypeExample example = new CredentialtypeExample();
        CredentialtypeExample.Criteria criteria = example.createCriteria();
        List<Credentialtype> credentialtypes = credentialtypeMapper.selectByExample(example);
        return credentialtypes;
    }

    @Override
    public List<Credentialtype> cList(Integer id) {
        CredentialtypeExample example = new CredentialtypeExample();
        CredentialtypeExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        List<Credentialtype> credentialtypes = credentialtypeMapper.selectByExample(example);
        return credentialtypes;
    }
}
