package com.hanergy.out.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hanergy.out.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Du Ronghong
 * @since 2019-09-23
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

    public SysUser findByPrimaryId(@Param("id") Integer id);

    public List<SysUser> searchByTreeIdAndKey(@Param("treeId") Integer treeId, @Param("key") String key);
}
