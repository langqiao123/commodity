package com.pptv.ott.commodity.goods.entity;

public class Goods {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods.id
     *
     * @return the value of t_goods.id
     *
     * @mbggenerated
     */
    private String keyWords;
    
    
    
    
   

	public String getKeyWords() {
		return keyWords;
	}

	public void setKeyWords(String keyWords) {
		this.keyWords = keyWords;
	}

	public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods.id
     *
     * @param id the value for t_goods.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods.name
     *
     * @return the value of t_goods.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods.name
     *
     * @param name the value for t_goods.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}