package sprint2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public String login() {
		return "login";
	}

		
	@RequestMapping("/authenticate")
	public String authenticate(@RequestParam(value="username", required=true) String username, @RequestParam(value="password", required=true) String password) {
		if((username.equals("admin") && password.equals("123")) || (username.equals("student") && password.equals("password"))) 		
			return "redirect:dashboard?username=" + username;
		else
			return "redirect:/";
	}
}
