package sprint2;

import java.sql.Time;
import java.util.Date;

public class Session {

	private Date date;
	private Time time;
	private Integer duration;
	private enum RepeatFrequency {
		
	    ONEOFF ("One Off"),
	    WEEKLY ("Weekly"),
	    FORTNIGHTLY ("Fortnightly");

	    private RepeatFrequency(String value){
	        this.value = value;
	    }

	    private final String value;

	    public String getValue(){return value;}
	    
	};

	private String lecturer;
	private String course;
	private Integer maxAttendance;
	private boolean compulsory;
	private String venue;

	public Session(Date d, Time t, int dur, String l, String co, String frequency, int maxA, boolean c, String v) {
		date = d;
		time = t;
		duration = dur;
		lecturer = l;
		course = co;
		maxAttendance = maxA;
		compulsory = c;
		venue = v;
	}

	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	public String getLecturer() {
		return lecturer;
	}
	public String getCourse() {
		return course;
	}
	public void setLecturer(String lecturer) {
		this.lecturer = lecturer;
	}
	public Integer getMaxAttendance() {
		return maxAttendance;
	}
	public void setMaxAttendance(Integer maxAttendance) {
		this.maxAttendance = maxAttendance;
	}
	public boolean isCompulsory() {
		return compulsory;
	}
	public void setCompulsory(boolean compulsory) {
		this.compulsory = compulsory;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}




}
