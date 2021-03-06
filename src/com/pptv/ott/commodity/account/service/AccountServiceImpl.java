package com.pptv.ott.commodity.account.service;

import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pptv.ott.commodity.account.dao.AccountDao;
import com.pptv.ott.commodity.account.entity.Account;
import com.pptv.ott.commodity.frame.utils.page.Pagination;

/**
 * 
 * @author <Auto generate>
 * @version 2015-04-15 13:44:42
 * @see com.yang.spinach.account.service.impl.Account
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {
	@Resource
	private AccountDao accountDao;

	@Override
	public Integer saveAccount(Account entity) throws Exception {
		return accountDao.saveAccount(entity);
	}

	@Override
	public Integer updateAccountById(Account entity) throws Exception {
		return accountDao.updateAccountById(entity);
	}

	@Override
	public Account selectAccountById(Long id) throws Exception {
		return accountDao.selectAccountById(id);
	}

	@Override
	public Account selectByUsername(String username) {
		return accountDao.selectByUsername(username);
	}

	@Override
	public List<Account> listPage(Account account, Pagination pagination) {
		return accountDao.listPage(account, pagination);
	}

	@Override
	public Set<String> findPermissions(String username) {
		return accountDao.findPermissions(username);
	}
}
