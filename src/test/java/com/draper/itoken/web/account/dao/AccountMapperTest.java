package com.draper.itoken.web.account.dao;

import com.draper.itoken.web.account.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


/**
 * @author draper_hxy
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountMapperTest {

    @Resource
    private AccountMapper accountMapper;

    @Test
    public void testSelectByAccount() {
        accountMapper.selectById("");
    }

    @Test
    public void testInsert() {
        Account account = new Account();
        account.setCreateAt(System.currentTimeMillis());
        account.setAccount("admin");
        account.setPassword("admin");
        account.setStatus(1);
        accountMapper.insert(account);
    }

}