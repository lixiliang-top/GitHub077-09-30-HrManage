package cn.kgc.ssm.mapper;

import cn.kgc.ssm.pojo.Customers;
import cn.kgc.ssm.pojo.CustomersExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomersMapper {
    int countByExample(CustomersExample example);

    int deleteByExample(CustomersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Customers record);

    int insertSelective(Customers record);

    List<Customers> selectByExample(CustomersExample example);

    Customers selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Customers record, @Param("example") CustomersExample example);

    int updateByExample(@Param("record") Customers record, @Param("example") CustomersExample example);

    int updateByPrimaryKeySelective(Customers record);

    int updateByPrimaryKey(Customers record);
}