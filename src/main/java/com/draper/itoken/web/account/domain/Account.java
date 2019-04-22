package com.draper.itoken.web.account.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.List;

/**
 * @author draper_hxy
 */
@Data
@TableName("user")
public class Account {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("create_at")
    private Long createAt;

    @TableField("update_at")
    private Long updateAt;

    @TableField("username")
    private String account;

    @TableField("password")
    private String password;

    @TableField("status")
    private Integer status;

    @TableField("note")
    private String note;

    private transient List<Role> roleList;


}
