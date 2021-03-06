package com.pptv.ott.commodity.dict.service;

import java.util.List;

import com.pptv.ott.commodity.dict.entity.Dict;
import com.pptv.ott.commodity.frame.utils.page.Pagination;

/**
 * 
 * @author <Auto generate>
 * @version 2015-05-31 15:46:09
 * @see com.yang.spinach.service.Dict
 */
public interface DictService {
	/**
	 * 保存
	 *
	 */
	public Integer saveDict(Dict entity) throws Exception;

	/**
	 * 修改
	 *
	 */
	public Integer updateDictById(Dict entity) throws Exception;

	/**
	 * 根据ID查找
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	Dict selectDictById(Object id) throws Exception;

	/**
	 * 根据对应表字段获取
	 * 
	 * @param column
	 * @return
	 */
	List<Dict> selectByColumn(String column);

	List<Dict> listPage(Pagination pagination, Dict dict);

}
