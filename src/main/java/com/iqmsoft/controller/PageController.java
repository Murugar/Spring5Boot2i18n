package com.iqmsoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iqmsoft.entity.Message;

@Controller
public class PageController {

	@Autowired
	private Message message;

	@RequestMapping("/")
	public String home(Model model) {
     /*english */
		model.addAttribute("pageHeader", message.getHomePageHeader());
		model.addAttribute("pageContent", message.getHomePageContent());
		return "views/home";
	}
	@RequestMapping("/about")
	public String about(Model model) {
		/*french */
		return "views/about";
	}

}
