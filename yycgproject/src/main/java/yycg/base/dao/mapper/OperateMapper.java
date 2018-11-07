package yycg.base.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yycg.base.pojo.po.Operate;
import yycg.base.pojo.po.OperateExample;

public interface OperateMapper {
    int countByExample(OperateExample example);

    int deleteByExample(OperateExample example);

    int deleteByPrimaryKey(String operateid);

    int insert(Operate record);

    int insertSelective(Operate record);

    List<Operate> selectByExample(OperateExample example);

    Operate selectByPrimaryKey(String operateid);

    int updateByExampleSelective(@Param("record") Operate record, @Param("example") OperateExample example);

    int updateByExample(@Param("record") Operate record, @Param("example") OperateExample example);

    int updateByPrimaryKeySelective(Operate record);

    int updateByPrimaryKey(Operate record);
}