package com.hanergy.out.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hanergy.out.entity.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Du Ronghong
 * @since 2019-09-23
 */
public interface ISysUserService extends IService<SysUser> {

    public SysUser findByUserName(String userName);

    public SysUser findByAccessToken(String token);

    public SysUser findByPrimaryId(@Param("id") Integer id);

    SysUser findByName(String name);

    List<SysUser> findByLikeUserName(String account);

    /**
     * 同级组织下所有用户模糊搜索
     * @param parentId 父级组织id
     * @param key  模糊搜索关键字
     * @return
     */
    public List<SysUser> searchByParentIdAndKey(Integer parentId, String key);

    List<SysUser> findByEmail(String email);
}
