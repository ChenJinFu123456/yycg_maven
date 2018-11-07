package yycg.base.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yycg.base.pojo.po.Roleoperate;
import yycg.base.pojo.po.RoleoperateExample;

public interface RoleoperateMapper {
    int countByExample(RoleoperateExample example);

    int deleteByExample(RoleoperateExample example);

    int insert(Roleoperate record);

    int insertSelective(Roleoperate record);

    List<Roleoperate> selectByExample(RoleoperateExample example);

    int updateByExampleSelective(@Param("record") Roleoperate record, @Param("example") RoleoperateExample example);

    int updateByExample(@Param("record") Roleoperate record, @Param("example") RoleoperateExample example);
}