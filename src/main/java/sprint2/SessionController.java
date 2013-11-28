package sprint2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SessionController {

	@RequestMapping("/session/create")
	public String create()
	{
		return "session/create";
	}
/*
	public String createSession(
@RequestParam(value="time", required=true) String time, 
@RequestParam(value="duration_dropdown", required=true) String duration , 
@RequestParam(value="frequence", required=true) String frequence, 
@RequestParam(value="lecture", required=true) String lecture , 
@RequestParam(value="max_attendance", required=true) String max_attendance ,
@RequestParam(value="compolsory", required=true) String compolsory 

) {
		return "session/create";
	}
*/
}
