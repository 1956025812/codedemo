package com.yzx.codedemo.mapper.user;


import com.yzx.codedemo.entity.user.SysUser;
import com.yzx.codedemo.vo.user.SysUserVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysUserMapper {

    int insertSelective(SysUser record);

    /**
     * 批量新增用户
     * @param sysUserList 用户集合
     */
    void saveSysUserBatch(@Param("sysUserList") List<SysUser> sysUserList) throws Exception;


    /**
     * 修改用户
     * @param sysUser
     * @return
     */
    int updateByPrimaryKeySelective(SysUser sysUser) throws Exception;


    /**
     * 批量修改用户
     * @param sysUserList
     */
    void updateSysUserBatch(@Param("sysUserList") List<SysUser> sysUserList) throws Exception;


    /**
     * 批量修改用户状态
     *
     * @param sysUserVO
     * <pre>
     *      userIdList 用户ID集合 <br>
     *      userState 用户状态
     * </pre>
     * @return Void
     * @throws Exception
     */
    void updateSysUserStateBatch(SysUserVO sysUserVO) throws Exception;


    /**
     * 根据主键查询用户对象
     * @param userId 用户ID
     * @return 用户对象
     * @throws Exception
     */
    SysUser selectByPrimaryKey(String userId) throws Exception;


    /**
     * 查询用户对象
     * @param sysUserVO
     *  <pre>
     *      userId 用户ID<br>
     *      userName 用户名称<br>
     *      passowrd 密码<br>
     *      phone 手机号
     *  </pre>
     * @return 用户VO对象
     * @throws Exception
     */
    SysUserVO selectSysUserVO(SysUserVO sysUserVO) throws Exception;


    /**
     * 查询用户列表
     * @param sysUserVO
     *  <pre>
     *      userName 用户名称<br>
     *      phone 手机号<br>
     *      userState 状态<br>
     *      starttime 开始时间<br>
     *      endtime 结束时间
     *  </pre>
     * @return 用户列表
     * @throws Exception
     */
    List<SysUserVO> selectSysUserVOList(SysUserVO sysUserVO) throws Exception;


    /**
     * 查询用户分页列表
     * @param sysUserVO
     *  <pre>
     *      currentPage 当前页码<br>
     *      pageSize 每页记录数<br>
     *      userName 用户名称<br>
     *      phone 手机号<br>
     *      userState 状态<br>
     *      starttime 开始时间<br>
     *      endtime 结束时间
     *  </pre>
     * @return 用户列表
     * @throws Exception
     */
    List<SysUserVO> selectSysUserPage(SysUserVO sysUserVO) throws Exception;
}