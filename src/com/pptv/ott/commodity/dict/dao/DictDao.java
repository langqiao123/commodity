package com.pptv.ott.commodity.dict.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.pptv.ott.commodity.dict.entity.Dict;
import com.pptv.ott.commodity.frame.utils.page.Pagination;

/**
 * 
 * @author <Auto generate>
 * @version 2015-05-31 15:46:09
 * @see com.yang.spinach.dao.Dict
 */
@Repository
public interface DictDao {
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

	List<Dict> selectByColumn(String column);

	List<Dict> listPage(@Param("pagination") Pagination pagination,
			@Param("dict") Dict dict);

}
