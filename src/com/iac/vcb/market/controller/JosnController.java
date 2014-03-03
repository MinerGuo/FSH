package com.iac.vcb.market.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import com.iac.vcb.market.entity.TestDBEntity;
import com.iac.vcb.market.service.ITestDBService;

@Controller
public class JosnController {

	@Resource
	private ITestDBService testDBService;

	@RequestMapping(value = "/json", method = RequestMethod.GET)
	public MappingJackson2JsonView testJsonResponse() {
		MappingJackson2JsonView result = new MappingJackson2JsonView();

		List<TestDBEntity> users = testDBService.loadAll();
		result.addStaticAttribute("users", users);

		return result;

	}

}
