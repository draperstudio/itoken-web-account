package com.draper.itoken.web.account.service;

import com.draper.itoken.web.account.domain.Account;

/**
 * @author draper_hxy
 */
public interface AccountService {

    Account selectAccount(String account);

    Account updateAccount(Account account);

    Boolean deleteAccount(String account);

}
