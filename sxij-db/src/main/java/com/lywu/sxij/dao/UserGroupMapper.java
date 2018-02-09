package com.lywu.sxij.dao;

import com.lywu.sxij.entity.UserGroup;
import com.lywu.sxij.entity.UserGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserGroupMapper {
    int countByExample(UserGroupExample example);

    int deleteByExample(UserGroupExample example);

    int insert(UserGroup record);

    int insertSelective(UserGroup record);

    List<UserGroup> selectByExample(UserGroupExample example);

    int updateByExampleSelective(@Param("record") UserGroup record, @Param("example") UserGroupExample example);

    int updateByExample(@Param("record") UserGroup record, @Param("example") UserGroupExample example);

    List<UserGroup> selectPage(UserGroupExample example);
}