package com.pptv.ott.commodity.account.dao;

import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.pptv.ott.commodity.account.entity.Account;
import com.pptv.ott.commodity.frame.utils.page.Pagination;

/**
 * 
 * @author <Auto generate>
 * @version 2015-04-15 13:44:42
 * @see com.yang.spinach.account.dao.Account
 */
@Repository
public interface AccountDao {
	/**
	 * 保存
	 *
	 */
	public Integer saveAccount(Account entity) throws Exception;

	/**
	 * 修改
	 *
	 */
	public Integer updateAccountById(Account entity) throws Exception;

	/**
	 * 根据ID查找
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	Account selectAccountById(Long id) throws Exception;

	/**
	 * 根据用户名和用户类型查找用户
	 * 
	 * @param username
	 * @param userType
	 * @return
	 */
	Account selectByUsername(String username);

	/**
	 * 分页查找
	 * 
	 * @param account
	 * @param pagination
	 * @return
	 */
	List<Account> listPage(@Param("user") Account account,
			@Param("pagination") Pagination pagination);

	/**
	 * 获取用户权限标识
	 * 
	 * @param username
	 * @param type
	 * @return
	 */
	Set<String> findPermissions(String username);
}
