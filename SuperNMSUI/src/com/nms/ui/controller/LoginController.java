package com.nms.ui.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class LoginController {

	@RequestMapping(method = RequestMethod.GET)
	public String showView() {

		return "login";
	}

}
