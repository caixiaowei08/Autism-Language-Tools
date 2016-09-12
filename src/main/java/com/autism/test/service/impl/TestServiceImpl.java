package com.autism.test.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.autism.framework.core.commom.service.impl.CommonServiceImpl;
import com.autism.test.service.TestServiceI;
/**
 * 
* @ClassName: TestServiceImpl 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author 华东师范大学 蔡晓伟 
* @date 2016年9月12日 下午8:18:34 
*
 */
@Service("testServiceI")
@Transactional
public class TestServiceImpl extends CommonServiceImpl implements TestServiceI {

}
