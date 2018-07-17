package com.yzx.codedemo.service.user;

import com.yzx.codedemo.entity.user.SysUser;
import com.yzx.codedemo.vo.PageVO;
import com.yzx.codedemo.vo.ResultVO;
import com.yzx.codedemo.vo.user.SysUserVO;

import java.util.List;

public interface SysUserService {

    /**
     * 添加用户
     *
     * @param sysUserVO
     * <pre>
     *      userName 用户名称<br>
     *      password 密码<br>
     *      phone 手机号
     * </pre>
     * @return 用户对象
     * @throws Exception
     */
    ResultVO<SysUser> saveSysUser(SysUserVO sysUserVO) throws Exception;


    /**
     * 批量新增用户
     *
     * @param sysUserVO
     *  <pre>
     *      sysUserVOList 用户集合
     *  </pre>
     * @return Void
     * @throws Exception
     */
    ResultVO<Void> saveSysUserBatch(SysUserVO sysUserVO) throws Exception;


    /**
     * 修改用户
     *
     * @param sysUserVO
     *  <pre>
     *      userId 用户ID<br>
     *      password 密码<br>
     *      phone 手机号
     *  </pre>
     * @return Void
     * @throws Exception
     */
    ResultVO<Void> updateSysUser(SysUserVO sysUserVO) throws Exception;


    /**
     * 批量修改用户
     * @param sysUserVO
     *  <pre>
     *      sysUserVOList 用户集合
     *  </pre>
     * @return Void
     * @throws Exception
     */
    ResultVO<Void> updateSysUserBatch(SysUserVO sysUserVO) throws Exception;


    /**
     * 修改用户状态
     *
     * @param sysUserVO
     * <pre>
     *      userId 用户ID <br>
     *      userState 用户状态
     * </pre>
     * @return Void
     * @throws Exception
     */
    ResultVO<Void> updateSysUserState(SysUserVO sysUserVO) throws Exception;


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
    ResultVO<Void> updateSysUserStateBatch(SysUserVO sysUserVO) throws Exception;


    /**
     * 查询用户
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
    ResultVO<SysUserVO> selectSysUser(SysUserVO sysUserVO) throws Exception;


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
    ResultVO<List<SysUserVO>> selectSysUserList(SysUserVO sysUserVO) throws Exception;


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
     * @return 用户分页列表
     * @throws Exception
     */
    ResultVO<PageVO<SysUserVO>> selectSysUserPage(SysUserVO sysUserVO) throws Exception;

}
