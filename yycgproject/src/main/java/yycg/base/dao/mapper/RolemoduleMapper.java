package yycg.base.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yycg.base.pojo.po.Rolemodule;
import yycg.base.pojo.po.RolemoduleExample;

public interface RolemoduleMapper {
    int countByExample(RolemoduleExample example);

    int deleteByExample(RolemoduleExample example);

    int insert(Rolemodule record);

    int insertSelective(Rolemodule record);

    List<Rolemodule> selectByExample(RolemoduleExample example);

    int updateByExampleSelective(@Param("record") Rolemodule record, @Param("example") RolemoduleExample example);

    int updateByExample(@Param("record") Rolemodule record, @Param("example") RolemoduleExample example);
}