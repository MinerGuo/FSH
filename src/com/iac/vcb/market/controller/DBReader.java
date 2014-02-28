package com.iac.vcb.market.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.iac.vcb.market.entity.TestDBEntity;
import com.iac.vcb.market.service.ITestDBService;

@Controller
public class DBReader {

	@Resource
	private ITestDBService testDBService;

	@RequestMapping("/dbread")
	public ModelAndView testDBRead() {

		List<TestDBEntity> users = testDBService.loadAll();

		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("users", users);

		modelAndView.setViewName("dbreader");

		return modelAndView;
	}

	
	@InitBinder("testDBEntity")
	public void initMinerTestDBEntityBinder(WebDataBinder binder) {
		binder.setFieldDefaultPrefix("t_miner_test.");
	}
	
	
	@RequestMapping("/dbread/ad")
	public ModelAndView testAdDdBRead(@ModelAttribute TestDBEntity testDBEntity, BindingResult result) {

		if (testDBEntity != null && !StringUtils.isEmpty(testDBEntity.getValue())) {
			testDBService.saveEntity(testDBEntity);
			System.out.println(testDBEntity);
		}else{
			System.out.println("user is empty!!");
		}

		List<TestDBEntity> users = testDBService.loadAll();

		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("users", users);
		modelAndView.addObject("user", testDBEntity);

		modelAndView.setViewName("dbreader");

		return modelAndView;
	}
}
