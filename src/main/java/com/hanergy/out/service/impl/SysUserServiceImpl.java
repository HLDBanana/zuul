package com.hanergy.out.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hanergy.out.dao.SysUserMapper;
import com.hanergy.out.entity.SysUser;
import com.hanergy.out.service.ISysUserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Du Ronghong
 * @since 2019-09-23
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {


    @Override
    public SysUser findByUserName(String userName) {
        QueryWrapper<SysUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username",userName);
        SysUser sysUser = this.baseMapper.selectOne(queryWrapper);
        return sysUser;
    }

    @Override
    public SysUser findByAccessToken(String token) {
        QueryWrapper<SysUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("opStatus",0);
        queryWrapper.and(i -> i.eq("accessToken",token).or().eq("accessTokenWeb",token));
        //queryWrapper.eq("accessToken",token).or().eq("accessTokenWeb",token);
        return this.baseMapper.selectOne(queryWrapper);
    }
    public SysUser findByPrimaryId(@Param("id") Integer id){
        return this.baseMapper.findByPrimaryId(id);
    }

    @Override
    public SysUser findByName(String name) {
        QueryWrapper<SysUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name",name);//.eq("opStatus",0);
        SysUser sysUser = this.baseMapper.selectOne(queryWrapper);
        return sysUser;
    }

    @Override
    public List<SysUser> findByLikeUserName(String account) {
        QueryWrapper<SysUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("username",account);
        return this.baseMapper.selectList(queryWrapper);
    }

    @Override
    public List<SysUser> searchByParentIdAndKey(Integer parentId, String key) {

        return this.baseMapper.searchByTreeIdAndKey(parentId,key);
    }

    @Override
    public List<SysUser> findByEmail(String email) {
        QueryWrapper<SysUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("email",email);
        return this.baseMapper.selectList(queryWrapper);
    }
}
