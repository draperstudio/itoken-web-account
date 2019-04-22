package com.draper.itoken.web.account.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.draper.itoken.web.account.domain.Role;

import java.util.List;

/**
 * @author draper_hxy
 */
public interface RoleMapper extends BaseMapper<Role> {

    List<Role> selectListByUserId(Long userId);

}
