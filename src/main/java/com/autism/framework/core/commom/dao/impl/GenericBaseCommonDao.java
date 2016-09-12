package com.autism.framework.core.commom.dao.impl;

import java.io.Serializable;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import com.autism.framework.core.base.Base;
import com.autism.framework.core.commom.dao.IGenericBaseCommonDao;

/**
 * 
* @ClassName: GenericBaseCommonDao 
* @Description: DAO层泛型基类
* @author 华东师范大学 蔡晓伟 
* @date 2016年9月12日 上午10:56:02 
* 
* @param <T>
* @param <PK>
 */
@SuppressWarnings("hiding")
@Repository
public class GenericBaseCommonDao<T, PK extends Serializable> extends Base implements IGenericBaseCommonDao {	
	/**
	 * 注入hibernate的session工厂 即数据源
	 */
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;
	
	public Session getSession() {
		// 事务必须是开启的(Required)，否则获取不到	
		return sessionFactory.getCurrentSession();
	}


	@Override
	public <T> Serializable save(T entity) {
		// TODO Auto-generated method stub
		try {
			Serializable id = getSession().save(entity);
			getSession().flush();
			if (logger.isDebugEnabled()) {
				logger.debug("保存实体成功," + entity.getClass().getName());
			}
			return id;
		} catch (RuntimeException e) {
			logger.error("保存实体异常", e);
			throw e;
		}
	}

	@Override
	public <T> void delete(T entity) {
		// TODO Auto-generated method stub
		try {
			getSession().delete(entity);
			getSession().flush();
			if (logger.isDebugEnabled()) {
				logger.debug("删除成功," + entity.getClass().getName());
			}
		} catch (RuntimeException e) {
			logger.error("删除异常", e);
			throw e;
		}
	}

	@Override
	public <T> void saveOrUpdate(T entity) {
		// TODO Auto-generated method stub
		try {
			getSession().saveOrUpdate(entity);
			getSession().flush();
			if (logger.isDebugEnabled()) {
				logger.debug("添加或更新成功," + entity.getClass().getName());
			}
		} catch (RuntimeException e) {
			logger.error("添加或更新异常", e);
			throw e;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T findUniqueByProperty(Class<T> entityClass, String propertyName, Object value) {
		// TODO Auto-generated method stub
		Assert.hasText(propertyName);
		return (T) createCriteria(entityClass,Restrictions.eq(propertyName, value)).uniqueResult();
	}
	
	private <T> Criteria createCriteria(Class<T> entityClass,
			Criterion... criterions) {
		Criteria criteria = getSession().createCriteria(entityClass);
		for (Criterion c : criterions) {
			criteria.add(c);
		}
		return criteria;
	}
	
	
	

}
