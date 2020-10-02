package cn.kgc.ssm.service;

import cn.kgc.ssm.pojo.Credentialtype;

import java.util.List;

/**
 * @author 李锡良
 * @create 2020-10-02 12:07
 */
public interface CredentialTypeService {

    List<Credentialtype> cList();

    List<Credentialtype> cList(Integer id);

}
