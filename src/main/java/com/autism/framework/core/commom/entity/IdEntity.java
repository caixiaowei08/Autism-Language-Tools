package com.autism.framework.core.commom.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;
/**
 * 
* @ClassName: IdEntity 
* @Description: 主键基类 提供主键生成策略
* @author 华东师范大学 蔡晓伟 
* @date 2016年9月12日 下午7:21:51 
*
 */
@MappedSuperclass
public abstract class IdEntity {
	
	private String id;

	@Id
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
	@Column(name ="ID",nullable=false,length=32)
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
