package com.autism.framework.core.commom.dao;

import java.io.Serializable;

/**
 * 
* @ClassName: IGenericBaseCommonDao 
* @Description: DAO层泛型基类 抽象基类
* @author 华东师范大学 蔡晓伟 
* @date 2016年9月12日 上午10:52:47 
*
 */
public interface IGenericBaseCommonDao{
	
	/**
	 * 单体元素操作 增加 
	 */
	public <T> Serializable save(T entity);
	/**
	 * 单体元素操作  删除 
	 */
	public <T> void delete(T entitie);
	/**
	 * 单体元素操作  修改
	 */
	public <T> void saveOrUpdate(T entity);
	
	/**
	 * 单体元素操作  查
	 */
	public <T> T findUniqueByProperty(Class<T> entityClass,String propertyName, Object value);

}
