package src.com.fightright.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class LoginController {
	
	
	@GetMapping("/login")
	public String homePage(Model model) {
		model.addAttribute("appName", "fightright");
		return "login";
	}
	
	@GetMapping("/")
	public String loginPage(Model model) {
		return "login";
	}
	
	@GetMapping("/403")
    public String error403() {
        return "/403";
    }
}
