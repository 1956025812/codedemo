package com.yzx.codedemo.vo.user;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserRoleVO {

    @ApiModelProperty("用户角色关系ID")
    private String userRoleId;
    @ApiModelProperty("用户ID")
    private String userId;
    @ApiModelProperty("用户名称")
    private String userName;

    @ApiModelProperty("角色ID")
    private String roleId;
    @ApiModelProperty("角色名称")
    private String roleName;
    @ApiModelProperty("角色描述")
    private String roleDescription;

    @ApiModelProperty("用户角色集合")
    private List<UserRoleVO> userRoleVOList;

    public String getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(String userRoleId) {
        this.userRoleId = userRoleId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }

    public List<UserRoleVO> getUserRoleVOList() {
        return userRoleVOList;
    }

    public void setUserRoleVOList(List<UserRoleVO> userRoleVOList) {
        this.userRoleVOList = userRoleVOList;
    }
}
