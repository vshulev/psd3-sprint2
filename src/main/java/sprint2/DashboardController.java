package sprint2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DashboardController {

	@RequestMapping("/dashboard")
	public String dashboard(@RequestParam(value="username", required=true) String username, Model model) {
		model.addAttribute("username", username);
		return "dashboard";
	}

}
