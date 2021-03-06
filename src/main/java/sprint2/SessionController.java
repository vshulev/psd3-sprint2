package sprint2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.sql.Time;
import java.util.Date;

@Controller
public class SessionController {

	@RequestMapping("/session/create")
	public String create()
	{
		return "session/create";
	}
	
	@RequestMapping("/session/insert")
	public String create(
		@RequestParam(value="date", required=true) String date,
		@RequestParam(value="time", required=true) String time, 
		@RequestParam(value="duration_dropdown", required=true) String duration , 
		@RequestParam(value="frequency", required=true) String frequency, 
		@RequestParam(value="lecturer", required=true) String lecturer , 
		@RequestParam(value="course", required=true) String course , 
		@RequestParam(value="max_attendance", required=true) String max_attendance ,
		@RequestParam(value="compulsory", required=true) String compulsory ,
		@RequestParam(value="venue", required=true) String venue
	)
	{
		// parse time (retarded way)
		String[] vals = time.split(":");
	
		Database db = Database.getInstance();
		db.insertSession(new Date(1/1/2014), new Time(Integer.parseInt(vals[0]), Integer.parseInt(vals[1]), Integer.parseInt(vals[2])), Integer.parseInt(duration), lecturer, course, frequency, Integer.parseInt(max_attendance), Boolean.parseBoolean(compulsory), venue);
		return "redirect:dashboard";
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
