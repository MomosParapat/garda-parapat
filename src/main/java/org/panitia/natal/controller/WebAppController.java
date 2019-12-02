package org.panitia.natal.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebAppController {
	private String appMode;

	@Autowired
	public WebAppController(Environment environment) {
		appMode = environment.getProperty("app-mode");
	}

	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("datetime", new Date());
		model.addAttribute("username", "Ömerrrr");
		model.addAttribute("mode", appMode);

		return "index";
	}

	@RequestMapping("/location")
	public String location(Model model) {
		model.addAttribute("pageTitle", "Lokasi");
		return "location";
	}
	@RequestMapping("/proposal")
	public String proposal(Model model) {
		model.addAttribute("pageTitle", "Proposal");
		return "proposal";
	}
}
