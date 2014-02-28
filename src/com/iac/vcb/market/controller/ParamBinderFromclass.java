package com.iac.vcb.market.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ParamBinderFromclass {

	@InitBinder("user")
	public void initUserBinder(WebDataBinder binder) {
		binder.setFieldDefaultPrefix("user.");
	}

	@RequestMapping("/bind2")
	public ModelAndView testBinderOuput(FormRegister user, BindingResult result) {

		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("user", user.getUser());

		modelAndView.setViewName("register");
		

		return modelAndView;
	}
}
