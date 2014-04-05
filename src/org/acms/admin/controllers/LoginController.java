package org.acms.admin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("cms/login")
public class LoginController {

	@RequestMapping(method = RequestMethod.GET)
	public String index() {
		System.out.println("--------");
		return "cms/login/index";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String login() {
		System.out.println("++++++++");
		return "cms/login/index";
	}
}
