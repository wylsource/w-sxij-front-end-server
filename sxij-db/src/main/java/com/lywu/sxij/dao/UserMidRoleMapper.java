package com.lywu.sxij.dao;

import com.lywu.sxij.entity.UserMidRole;
import com.lywu.sxij.entity.UserMidRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMidRoleMapper {
    int countByExample(UserMidRoleExample example);

    int deleteByExample(UserMidRoleExample example);

    int insert(UserMidRole record);

    int insertSelective(UserMidRole record);

    List<UserMidRole> selectByExample(UserMidRoleExample example);

    int updateByExampleSelective(@Param("record") UserMidRole record, @Param("example") UserMidRoleExample example);

    int updateByExample(@Param("record") UserMidRole record, @Param("example") UserMidRoleExample example);

    List<UserMidRole> selectPage(UserMidRoleExample example);
}