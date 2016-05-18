package com.pptv.ott.commodity.goods.service;

import java.util.List;
import java.util.Set;

import com.pptv.ott.commodity.account.entity.Account;
import com.pptv.ott.commodity.frame.utils.page.Pagination;
import com.pptv.ott.commodity.goods.entity.Goods;

/**
 * 
 * @author <Auto generate>
 * @version 2015-04-15 13:44:42
 * @see com.yang.spinach.account.service.Account
 */
public interface GoodsService {
	/**
	 * 保存
	 *
	 */
	public Integer saveGoods(Goods entity) throws Exception;

	/**
	 * 修改
	 *
	 */
	public Integer updateGoodsById(Goods entity) throws Exception;

	/**
	 * 根据ID查找
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	Goods selectGoodsById(Integer id) throws Exception;

	Goods selectByName(String name,Integer id);

	List<Goods> listPage(Goods goods, Pagination pagination);


}
