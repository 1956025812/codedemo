package com.yzx.codedemo.service.user.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yzx.codedemo.constant.user.SysUserConstant;
import com.yzx.codedemo.entity.user.SysUser;
import com.yzx.codedemo.mapper.user.SysUserMapper;
import com.yzx.codedemo.service.user.SysUserService;
import com.yzx.codedemo.util.CommonUtil;
import com.yzx.codedemo.vo.PageVO;
import com.yzx.codedemo.vo.ResultVO;
import com.yzx.codedemo.vo.user.SysUserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;


    @Transactional
    @Override
    public ResultVO<SysUser> saveSysUser(SysUserVO sysUserVO) throws Exception {

        SysUser sysUser = new SysUser();
        sysUser.setId(CommonUtil.generatorId());
        sysUser.setUserName(sysUserVO.getUserName());
        sysUser.setPhone(sysUserVO.getPhone());
        sysUser.setPassword(sysUserVO.getPhone());
        sysUser.setState(SysUserConstant.SYS_USER_STATE_NORMAL);
        sysUser.setCreatetime(new Date());
        this.sysUserMapper.insertSelective(sysUser);

        return ResultVO.getSuccess("添加用户成功", sysUser);
    }


    @Transactional
    @Override
    public ResultVO<Void> saveSysUserBatch(SysUserVO sysUserVO) throws Exception {

        List<SysUser> sysUserList = new ArrayList<>();

        List<SysUserVO> sysUserVOList = sysUserVO.getSysUserVOList();
        for (SysUserVO each : sysUserVOList) {
            SysUser sysUser = new SysUser();
            sysUser.setId(CommonUtil.generatorId());
            sysUser.setUserName(each.getUserName());
            sysUser.setPassword(each.getPassword());
            sysUser.setPhone(each.getPhone());
            sysUser.setState(SysUserConstant.SYS_USER_STATE_NORMAL);
            sysUser.setCreatetime(new Date());
            sysUserList.add(sysUser);
        }

        this.sysUserMapper.saveSysUserBatch(sysUserList);

        return ResultVO.getSuccess("批量新增用户成功");
    }


    @Transactional
    @Override
    public ResultVO<Void> updateSysUser(SysUserVO sysUserVO) throws Exception {

        SysUser sysUser = new SysUser();
        sysUser.setId(sysUserVO.getUserId());
        sysUser.setPassword(sysUserVO.getPassword());
        sysUser.setPhone(sysUserVO.getPhone());
        this.sysUserMapper.updateByPrimaryKeySelective(sysUser);

        return ResultVO.getSuccess("修改用户成功");
    }


    @Transactional
    @Override
    public ResultVO<Void> updateSysUserBatch(SysUserVO sysUserVO) throws Exception {

        List<SysUser> sysUserList = new ArrayList<>();

        List<SysUserVO> sysUserVOList = sysUserVO.getSysUserVOList();
        for (SysUserVO each : sysUserVOList) {
            SysUser sysUser = new SysUser();
            sysUser.setId(each.getUserId());
            sysUser.setPassword(each.getPassword());
            sysUser.setPhone(each.getPhone());
            sysUserList.add(sysUser);
        }

        this.sysUserMapper.updateSysUserBatch(sysUserList);

        return ResultVO.getSuccess("批量修改用户成功");
    }


    @Transactional
    @Override
    public ResultVO<Void> updateSysUserState(SysUserVO sysUserVO) throws Exception {

        SysUser sysUser = new SysUser();
        sysUser.setId(sysUserVO.getUserId());
        sysUser.setState(sysUserVO.getUserState());
        this.sysUserMapper.updateByPrimaryKeySelective(sysUser);

        return ResultVO.getSuccess("修改用户状态成功");
    }


    @Transactional
    @Override
    public ResultVO<Void> updateSysUserStateBatch(SysUserVO sysUserVO) throws Exception {

        this.sysUserMapper.updateSysUserStateBatch(sysUserVO);

        return ResultVO.getSuccess("批量修改用户状态成功");
    }


    @Override
    public ResultVO<SysUserVO> selectSysUser(SysUserVO sysUserVO) throws Exception {

        SysUserVO newSysUserVO = this.sysUserMapper.selectSysUserVO(sysUserVO);

        return ResultVO.getSuccess("查询用户成功", newSysUserVO);
    }


    @Override
    public ResultVO<List<SysUserVO>> selectSysUserList(SysUserVO sysUserVO) throws Exception {

        List<SysUserVO> sysUserVOList = this.sysUserMapper.selectSysUserVOList(sysUserVO);
        System.out.println(1/0);
        return ResultVO.getSuccess("查询用户列表成功", sysUserVOList);
    }


    @Override
    public ResultVO<PageVO<SysUserVO>> selectSysUserPage(SysUserVO sysUserVO) throws Exception {

        PageHelper.startPage(sysUserVO.getCurrentPage(), sysUserVO.getPageSize());
        List<SysUserVO> sysUserVOList = this.sysUserMapper.selectSysUserPage(sysUserVO);
        PageInfo<SysUserVO> pageInfo = new PageInfo<>(sysUserVOList);

        PageVO<SysUserVO> pageVO = new PageVO<>(
                pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getTotal(),
                pageInfo.getPages(), pageInfo.getList()
        );

        return ResultVO.getSuccess("查询分页列表成功", pageVO);
    }
}
