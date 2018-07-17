package com.yzx.codedemo.service.user;

import com.yzx.codedemo.vo.ResultVO;
import com.yzx.codedemo.vo.user.UserRoleVO;

public interface UserRoleService {

    /**
     * 查询用户角色列表
     * @param userRoleVO
     *  <pre>
     *      userId 用户ID
     *  </pre>
     * @return 用户角色VO对象
     * @throws Exception
     */
    ResultVO<UserRoleVO> selectUserRoleList(UserRoleVO userRoleVO) throws Exception;

}
