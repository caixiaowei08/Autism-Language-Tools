package com.autism.framework.system.pojo;
/**
 * 
* @ClassName: TUser 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author 华东师范大学 蔡晓伟 
* @date 2016年9月11日 下午9:04:23 
*
 */
public class TUser implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 姓名
	 */
	private String name ;
	/**
	 * 密码
	 */
    private String pwd ;
    
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPwd() {
		return pwd;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
    
    
	
	
	
	

}
