package sprint2;

import java.sql.Time;
import java.util.Date;

public class Session {

	private Date date;
	private Time time;
	private Integer duration;
	private enum repeatFrequency {
		
	    ONEOFF ("One Off"),
	    WEEKLY ("Weekly"),
	    FORTNIGHTLY ("Fortnightly");

	    private repeatFrequency(String value){
	        this.value = value;
	    }

	    private final String value;

	    public String getValue(){return value;}
	    
	};

	private String lecturer;
	private Integer maxAttendance;
	private boolean compulsory;
	private String venue;

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
