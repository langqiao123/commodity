package com.pptv.ott.commodity.goods.service;

import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pptv.ott.commodity.account.dao.AccountDao;
import com.pptv.ott.commodity.account.entity.Account;
import com.pptv.ott.commodity.frame.utils.page.Pagination;
import com.pptv.ott.commodity.goods.dao.GoodsMapper;
import com.pptv.ott.commodity.goods.entity.Goods;

/**
 * 
 * @author <Auto generate>
 * @version 2015-04-15 13:44:42
 * @see com.yang.spinach.account.service.impl.Account
 */
@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {
	@Resource
	private GoodsMapper goodsMapper;

	@Override
	public Integer saveGoods(Goods entity) throws Exception {
		return goodsMapper.insert(entity);
	}

	@Override
	public Integer updateGoodsById(Goods entity) throws Exception {
		return goodsMapper.updateByPrimaryKeySelective(entity);
	}

	@Override
	public Goods selectGoodsById(Integer id) throws Exception {
		return this.goodsMapper.selectByPrimaryKey(id);
	}

	@Override
	public Goods selectByName(String name,Integer id) {
		return this.goodsMapper.selectByName(name,id);
	}

	@Override
	public List<Goods> listPage(Goods goods, Pagination pagination) {
		return goodsMapper.listPage(goods, pagination);
	}



}
