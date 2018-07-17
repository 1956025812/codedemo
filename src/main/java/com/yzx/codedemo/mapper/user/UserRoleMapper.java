package com.yzx.codedemo.mapper.user;

import com.yzx.codedemo.entity.user.UserRole;
import com.yzx.codedemo.vo.user.UserRoleVO;

public interface UserRoleMapper {

    int insert(UserRole record);

    int updateByPrimaryKeySelective(UserRole record);

    UserRole selectByPrimaryKey(String id);

    /**
     * 查询用户角色列表
     * @param userRoleVO
     *  <pre>
     *      userId 用户ID
     *  </pre>
     * @return 用户角色VO对象
     */
    UserRoleVO selectUserRoleVOList(UserRoleVO userRoleVO);

}