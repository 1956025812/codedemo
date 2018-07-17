package com.yzx.codedemo.service.user.impl;

import com.yzx.codedemo.mapper.user.UserRoleMapper;
import com.yzx.codedemo.service.user.UserRoleService;
import com.yzx.codedemo.vo.ResultVO;
import com.yzx.codedemo.vo.user.UserRoleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private UserRoleMapper userRoleMapper;


    @Override
    public ResultVO<UserRoleVO> selectUserRoleList(UserRoleVO userRoleVO) throws Exception {

        UserRoleVO newUserRoleVO = this.userRoleMapper.selectUserRoleVOList(userRoleVO);

        return ResultVO.getSuccess("查询用户角色列表成功", newUserRoleVO);
    }
}
