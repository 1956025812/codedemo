package com.yzx.codedemo.mapper.user;

import com.yzx.codedemo.entity.user.UserRole;
import com.yzx.codedemo.vo.user.UserRoleVO;

public interface UserRoleMapper {

    int insert(UserRole record) throws Exception;

    int updateByPrimaryKeySelective(UserRole record) throws Exception;

    UserRole selectByPrimaryKey(String id) throws Exception;

    /**
     * 查询用户角色列表
     * @param userRoleVO
     *  <pre>
     *      userId 用户ID
     *  </pre>
     * @return 用户角色VO对象
     */
    UserRoleVO selectUserRoleVOList(UserRoleVO userRoleVO) throws Exception;

}