package src.com.fightright.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DashboardController {

	@GetMapping("/dashboard")
	public String homePage(Model model) {
		return "dashboard";
	}
	
	@GetMapping("/caseprocessing")
	public String caseprocessing(Model model) {
		return "caseprocessing";
	}

}
