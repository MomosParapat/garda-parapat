package org.panitia.natal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommitteePage {
	@RequestMapping("/panitia")
	public String index(Model model) {
		model.addAttribute("pageTitle", "Panitia Natal");
		return "committee";
	}

}
