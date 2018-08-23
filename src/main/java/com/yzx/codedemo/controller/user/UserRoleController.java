package com.yzx.codedemo.controller.user;

import com.yzx.codedemo.controller.BaseController;
import com.yzx.codedemo.service.user.UserRoleService;
import com.yzx.codedemo.vo.ResultVO;
import com.yzx.codedemo.vo.user.UserRoleVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@Api(tags = {"UserRoleController"}, description = "用户角色关系Controller")
@RestController
@RequestMapping(value = "/userrole")
public class UserRoleController extends BaseController {

    @Autowired
    private UserRoleService userRoleService;


    @ApiOperation("查询用户角色列表")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", dataType = "Long", name = "userId", value = "用户ID", required = true)
    })
    @GetMapping(value = "/list")
    public ResultVO<UserRoleVO> selectUserRoleList(@ApiIgnore UserRoleVO userRoleVO) throws Exception {
        return this.userRoleService.selectUserRoleList(userRoleVO);
    }


}
