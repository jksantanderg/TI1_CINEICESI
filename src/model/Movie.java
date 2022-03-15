package model;

public class Movie {
	private String nameMovie;
	private String date;
	private String hour;
	private String duration;
	private String hall;
	
	private Cinema cinema;

	/**
	 * @param nameMovie
	 * @param date
	 * @param hour
	 * @param duration
	 * @param hall
	 */
	public Movie(String nameMovie, String date, String hour, String duration, String hall) {
		super();
		this.nameMovie = nameMovie;
		this.date = date;
		this.hour = hour;
		this.duration = duration;
		this.hall = hall;
	}

	/**
	 * @return the nameMovie
	 */
	public String getNameMovie() {
		return nameMovie;
	}

	/**
	 * @param nameMovie the nameMovie to set
	 */
	public void setNameMovie(String nameMovie) {
		this.nameMovie = nameMovie;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return the hour
	 */
	public String getHour() {
		return hour;
	}

	/**
	 * @param hour the hour to set
	 */
	public void setHour(String hour) {
		this.hour = hour;
	}

	/**
	 * @return the duration
	 */
	public String getDuration() {
		return duration;
	}

	/**
	 * @param duration the duration to set
	 */
	public void setDuration(String duration) {
		this.duration = duration;
	}

	/**
	 * @return the hall
	 */
	public String getHall() {
		return hall;
	}

	/**
	 * @param hall the hall to set
	 */
	public void setHall(String hall) {
		this.hall = hall;
	}

	/**
	 * @return the cinema
	 */
	public Cinema getCinema() {
		return cinema;
	}

	/**
	 * @param cinema the cinema to set
	 */
	public void setCinema(Cinema cinema) {
		this.cinema = cinema;
	}
}
