package org.panitia.natal.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AboutPage {
	
	@RequestMapping("/about")
	public String index(Model model) {
        model.addAttribute("pageTitle", "About Us");
        return "about-us";
	}

}
