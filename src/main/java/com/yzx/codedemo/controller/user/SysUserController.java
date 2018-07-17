package com.yzx.codedemo.controller.user;

import com.yzx.codedemo.entity.user.SysUser;
import com.yzx.codedemo.service.user.SysUserService;
import com.yzx.codedemo.vo.PageVO;
import com.yzx.codedemo.vo.ResultVO;
import com.yzx.codedemo.vo.user.SysUserVO;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

@Api(tags = {"SysUserController"}, description = "用户Controller")
@RestController
@RequestMapping(value = "/sysuser")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;


    @ApiOperation("新增用户")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "userName", value = "用户名称", required = true),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "password", value = "密码", required = false),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "phone", value = "手机号", required = false)
    })
    @PostMapping("/save")
    public ResultVO<SysUser> saveSysUser(@ApiIgnore @RequestBody SysUserVO sysUserVO) {
        try {
            return this.sysUserService.saveSysUser(sysUserVO);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultVO.getFailed("添加用户失败");
        }
    }


    @ApiOperation("批量新增用户")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "sysUserVOList", value = "用户集合", required = true)
    })
    @PostMapping("/save/batch")
    public ResultVO<Void> saveSysUserBatch(@ApiIgnore @RequestBody SysUserVO sysUserVO) {
        try {
            return this.sysUserService.saveSysUserBatch(sysUserVO);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultVO.getSuccess("批量添加用户失败");
        }
    }


    @ApiOperation("修改用户")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "userId", value = "用户ID", required = true),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "password", value = "密码", required = false),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "phone", value = "手机号", required = false)
    })
    @PostMapping(value = "/update")
    public ResultVO<Void> updateSysUser(@ApiIgnore @RequestBody SysUserVO sysUserVO) {
        try {
            return this.sysUserService.updateSysUser(sysUserVO);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultVO.getFailed("修改用户失败");
        }
    }


    @ApiOperation("批量修改用户")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "sysUserVOList", value = "用户集合", required = true)
    })
    @PostMapping(value = "/update/batch")
    public ResultVO<Void> updateSysUserBatch(@ApiIgnore @RequestBody SysUserVO sysUserVO) {
        try {
            return this.sysUserService.updateSysUserBatch(sysUserVO);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultVO.getSuccess("批量修改用户成功");
        }
    }


    @ApiOperation("修改用户状态")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "userId", value = "用户ID", required = true),
            @ApiImplicitParam(paramType = "body", dataType = "Long", name = "userState", value = "用户状态 0删除 1正常", required = false)
    })
    @PostMapping(value = "/update/state")
    public ResultVO<Void> updateSysUserState(@ApiIgnore @RequestBody SysUserVO sysUserVO) {
        try {
            return this.sysUserService.updateSysUserState(sysUserVO);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultVO.getFailed("修改用户状态失败");
        }
    }


    @ApiOperation("批量修改用户状态")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "userIdList", value = "用户ID集合", required = true),
            @ApiImplicitParam(paramType = "body", dataType = "Long", name = "userState", value = "用户状态", required = false)
    })
    @PostMapping(value = "/update/state/batch")
    public ResultVO<Void> updateSysUserStateBatch(@ApiIgnore @RequestBody SysUserVO sysUserVO) {
        try {
            return this.sysUserService.updateSysUserStateBatch(sysUserVO);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultVO.getFailed("批量修改用户状态失败");
        }
    }


    @ApiOperation("查询用户")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", dataType = "Long", name = "userId", value = "用户ID", required = false),
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "userName", value = "用户名称", required = false),
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "password", value = "密码", required = false),
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "phone", value = "手机号", required = false)
    })
    @GetMapping(value = "/select")
    public ResultVO<SysUserVO> selectSysUser(@ApiIgnore SysUserVO sysUserVO) {
        try {
            return this.sysUserService.selectSysUser(sysUserVO);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultVO.getFailed("查询用户失败");
        }
    }


    @ApiOperation("查询用户列表")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "userName", value = "用户名称", required = false),
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "phone", value = "手机号", required = false),
            @ApiImplicitParam(paramType = "query", dataType = "Long", name = "userState", value = "用户状态: 0删除 1正常", required = false),
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "starttime", value = "开始时间 格式：yyyy-MM-dd HH:mm:ss", required = false),
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "endtime", value = "结束时间 格式：yyyy-MM-dd HH:mm:ss", required = false)
    })
    @GetMapping(value = "/list")
    public ResultVO<List<SysUserVO>> selectSysUserList(@ApiIgnore SysUserVO sysUserVO) {
        try {
            return this.sysUserService.selectSysUserList(sysUserVO);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultVO.getFailed("查询用户列表失败");
        }
    }


    @ApiOperation("查询用户分页列表")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", dataType = "Long", name = "currentPage", value = "当前页码", required = true),
            @ApiImplicitParam(paramType = "query", dataType = "Long", name = "pageSize", value = "每页记录数", required = true),
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "userName", value = "用户名称", required = false),
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "phone", value = "手机号", required = false),
            @ApiImplicitParam(paramType = "query", dataType = "Long", name = "userState", value = "用户状态: 0删除 1正常", required = false),
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "starttime", value = "开始时间 格式：yyyy-MM-dd HH:mm:ss", required = false),
            @ApiImplicitParam(paramType = "query", dataType = "String", name = "endtime", value = "结束时间 格式：yyyy-MM-dd HH:mm:ss", required = false)
    })
    @GetMapping(value = "/page")
    public ResultVO<PageVO<SysUserVO>> selectSysUserPage(@ApiIgnore SysUserVO sysUserVO) {
        try {
            return this.sysUserService.selectSysUserPage(sysUserVO);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultVO.getSuccess("查询用户分页列表失败");
        }
    }


}
