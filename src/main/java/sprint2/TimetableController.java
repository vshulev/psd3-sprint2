package sprint2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TimetableController {

	@RequestMapping("/timetable/view")
	public String dashboard(@RequestParam(value="username", required=false) String username, Model model) {
		model.addAttribute("username", username);
		model.addAttribute("class1", "PSD3");
		model.addAttribute("class2", "ALG3");
		model.addAttribute("class3", "AP3");
		



		return "timetable/view";
	}

}
