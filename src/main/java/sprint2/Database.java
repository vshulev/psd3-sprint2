package sprint2;

import java.sql.Time;
import java.util.Date;
import java.util.ArrayList;

public class Database {

	private static Database m;
	private ArrayList<Session> sessions;

	private Database() {
		sessions = new ArrayList<Session>();
	}

	public static Database getInstance() {
		if(m == null) {
			m = new Database();
		}
		return m;
	}
	
	public Session[] getTimetableInfo(String studentID) {
		/*
		Session[] sessions = {
			new Session(new Date(1/1/2014), new Time(12, 00, 00), 60, "Jeremy Singer", "PSD3", "Weekly", 400, true, "BO 720"),
			new Session(new Date(5/1/2014), new Time(14, 00, 00), 60, "Tim Storer", "PSD3", "Weekly", 10, true, "BO 720"),
			new Session(new Date(10/1/2014), new Time(10, 00, 00), 60, "Joe Sventek", "AP3", "Fortnightly", 4000, false, "BO 513"),
			new Session(new Date(12/1/2014), new Time(9, 00, 00), 60, "Jeremy Singer","PSD3", "Weekly", 100, true, "BO 1"),
		};
		*/
		return (Session[]) sessions.toArray();
	
	}
	
	public void insertSession(Date d, Time t, int dur, String l, String co, String frequency, int maxA, boolean c, String v) {
		sessions.add( new Session(d, t, dur, l, co, frequency, maxA, c, v) );
	}
	
}
