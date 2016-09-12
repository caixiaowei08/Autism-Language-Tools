package com.autism.framework.system.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.autism.framework.core.commom.controller.BaseController;
import com.autism.framework.core.commom.model.json.AjaxJson;
import com.autism.framework.system.pojo.TUser;
/**
 * 		
* @ClassName: LoginController 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author 华东师范大学 蔡晓伟 
* @date 2016年9月11日 下午9:02:17 
*
 */

@Scope("prototype")
@Controller
@RequestMapping("/loginController")
public class LoginController extends BaseController{
	
	@RequestMapping(params = "checkuser")
	@ResponseBody
	public AjaxJson checkuser(TUser user, HttpServletRequest req) {
		logger.info("--------------AjaxJson----------------");
		AjaxJson j = new AjaxJson();	
		return j;
	}
	
	

}
