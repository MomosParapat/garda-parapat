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
	
//	@RequestMapping("/about")
//	public String about(Model model) {
//        model.addAttribute("pageTitle", "Tentang Kami");
//        return "about-us";
//	}
	@RequestMapping("/panitia")
	public String commite(Model model) {
		model.addAttribute("pageTitle", "Susunan Panitia");
		return "committee";
	}

	@RequestMapping("/pembicara")
	public String speaker(Model model) {
		model.addAttribute("pageTitle", "Pelayan Firman Tuhan");
		return "pembicara";
	}
	
	@RequestMapping("/faq")
	public String faq(Model model) {
		model.addAttribute("pageTitle", "Tanya Jawab");
		return "faq";
	}
	@RequestMapping("/acara")
	public String acara(Model model) {
		model.addAttribute("pageTitle", "Susunan Acara");
		return "acara";
	}
}
