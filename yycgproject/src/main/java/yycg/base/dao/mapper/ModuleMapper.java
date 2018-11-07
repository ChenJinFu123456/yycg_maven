package yycg.base.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yycg.base.pojo.po.Module;
import yycg.base.pojo.po.ModuleExample;

public interface ModuleMapper {
    int countByExample(ModuleExample example);

    int deleteByExample(ModuleExample example);

    int deleteByPrimaryKey(String moduleid);

    int insert(Module record);

    int insertSelective(Module record);

    List<Module> selectByExample(ModuleExample example);

    Module selectByPrimaryKey(String moduleid);

    int updateByExampleSelective(@Param("record") Module record, @Param("example") ModuleExample example);

    int updateByExample(@Param("record") Module record, @Param("example") ModuleExample example);

    int updateByPrimaryKeySelective(Module record);

    int updateByPrimaryKey(Module record);
}