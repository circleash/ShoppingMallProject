package com.Yeolgongpiltem.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class MainController {
	@GetMapping("/main_view")
	public String mainView() {
		return "main/main";
	}
}
