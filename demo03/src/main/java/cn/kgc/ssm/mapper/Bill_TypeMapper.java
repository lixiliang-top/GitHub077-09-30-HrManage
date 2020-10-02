package cn.kgc.ssm.mapper;

import cn.kgc.ssm.pojo.Bill_Type;
import cn.kgc.ssm.pojo.Bill_TypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Bill_TypeMapper {
    int countByExample(Bill_TypeExample example);

    int deleteByExample(Bill_TypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Bill_Type record);

    int insertSelective(Bill_Type record);

    List<Bill_Type> selectByExample(Bill_TypeExample example);

    Bill_Type selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Bill_Type record, @Param("example") Bill_TypeExample example);

    int updateByExample(@Param("record") Bill_Type record, @Param("example") Bill_TypeExample example);

    int updateByPrimaryKeySelective(Bill_Type record);

    int updateByPrimaryKey(Bill_Type record);
}