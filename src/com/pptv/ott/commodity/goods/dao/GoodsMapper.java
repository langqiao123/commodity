package com.pptv.ott.commodity.goods.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.pptv.ott.commodity.frame.utils.page.Pagination;
import com.pptv.ott.commodity.goods.entity.Goods;
@Repository
public interface GoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_goods
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_goods
     *
     * @mbggenerated
     */
    int insert(Goods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_goods
     *
     * @mbggenerated
     */
    int insertSelective(Goods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_goods
     *
     * @mbggenerated
     */
    Goods selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_goods
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Goods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_goods
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Goods record);
    
    Goods selectByName(@Param("name") String name,@Param("id") Integer id);
    
    /**
	 * 分页查找
	 * 
	 * @param account
	 * @param pagination
	 * @return
	 */
	List<Goods> listPage(@Param("goods") Goods goods,
			@Param("pagination") Pagination pagination);
}