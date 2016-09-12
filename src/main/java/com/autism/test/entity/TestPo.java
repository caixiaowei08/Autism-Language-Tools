package com.autism.test.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import com.autism.framework.core.commom.entity.IdEntity;

/**
 * 
* @ClassName: TestPo 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author 华东师范大学 蔡晓伟 
* @date 2016年9月12日 下午7:12:09 
*
 */

@Entity
@Table(name = "testpo")
@Inheritance(strategy = InheritanceType.JOINED)
public class TestPo extends IdEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name ;
	 
	private int age ;

	@Column(name = "name",length=32,nullable=false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Column(name = "age",nullable =true)
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
