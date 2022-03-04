package model;


public class Film {
	private String name;
	private String date;
	private String hour;
	private String duration;
	private String hall;
	
	//private ArrayList<Film> films;
	
	public Film(String name, String data, String hour, String duration, String hall) {
		super();
		this.name = name;
		this.date = data;
		this.hour = hour;
		this.duration = duration;
		this.hall = hall;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getData() {
		return date;
	}


	public void setData(String data) {
		this.date = data;
	}


	public String getHour() {
		return hour;
	}


	public void setHour(String hour) {
		this.hour = hour;
	}


	public String getDuration() {
		return duration;
	}


	public void setDuration(String duration) {
		this.duration = duration;
	}


	public String getHall() {
		return hall;
	}


	public void setHall(String hall) {
		this.hall = hall;
	}
}
