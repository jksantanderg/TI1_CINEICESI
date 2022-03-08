package model;

import java.util.ArrayList;

public class Movie {
	private String nameMovie;
	private String date;
	private String hour;
	private String duration;
	private String hall;
	
	private ArrayList<Student> students;
	//private Room sala;


	public Movie(String name, String data, String hour, String duration, String hall) {
		super();
		this.nameMovie = nameMovie;
		this.date = data;
		this.hour = hour;
		this.duration = duration;
		this.hall = hall;
	}


	public String getName() {
		return nameMovie;
	}


	public void setName(String nameMovie) {
		this.nameMovie = nameMovie;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String data) {
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
