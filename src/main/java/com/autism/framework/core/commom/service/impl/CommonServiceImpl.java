package com.autism.framework.core.commom.service.impl;

import java.io.Serializable;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.autism.framework.core.base.Base;
import com.autism.framework.core.commom.dao.IGenericBaseCommonDao;
import com.autism.framework.core.commom.service.CommonService;

/**
 * 
* @ClassName: CommonServiceImpl 
* @Description: 业务层基类
* @author 华东师范大学 蔡晓伟 
* @date 2016年9月12日 上午11:22:53 
*
 */
@Service("commonService")
@Transactional
public class CommonServiceImpl extends Base implements CommonService{
	
	public IGenericBaseCommonDao iGenericBaseCommonDao;

	

	public IGenericBaseCommonDao getiGenericBaseCommonDao() {
		return iGenericBaseCommonDao;
	}


    @Resource
	public void setiGenericBaseCommonDao(IGenericBaseCommonDao iGenericBaseCommonDao) {
		this.iGenericBaseCommonDao = iGenericBaseCommonDao;
	}



	@Override
	public <T> Serializable save(T entity) {
		// TODO Auto-generated method stub
		return iGenericBaseCommonDao.save(entity);
	}
	
	

}
