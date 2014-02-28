package com.iac.vcb.market.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.iac.vcb.market.entity.User;


/**
 * 使用@InitBinder方式将页面输入参数绑定到对象
 * @author mguo
 *
 */
@Controller
public class ParamBinderInitBinder {

	@InitBinder("user")
	public void initUserBinder(WebDataBinder binder) {
		binder.setFieldDefaultPrefix("user.");
	}
	


	@RequestMapping("/bind1")
	public ModelAndView testBinderOuput(@ModelAttribute User user, BindingResult result) {

		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("user", user);

		modelAndView.setViewName("register");
		

		return modelAndView;
	}
}
