package com.autism.test.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.autism.framework.core.commom.controller.BaseController;
import com.autism.framework.core.commom.model.json.AjaxJson;
import com.autism.framework.system.pojo.TUser;
import com.autism.test.entity.TestPo;
import com.autism.test.service.TestServiceI;

@Scope("prototype")
@Controller
@RequestMapping("testController")
public class TestController extends BaseController {

	@Autowired
	private TestServiceI testServiceI;

	@RequestMapping(params = "test")
	@ResponseBody
	 public AjaxJson test(TUser user, HttpServletRequest req){
		AjaxJson j = new AjaxJson();
		TestPo testPo = new TestPo();
		testPo.setName("蔡晓伟");
		testPo.setAge(25);
		testServiceI.save(testPo);
		return j;
	 }

}
