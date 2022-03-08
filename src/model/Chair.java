package model;

public class Chair {
	private boolean availability;
	
	private Cinema cinema;

	public Chair(boolean availability) {
		super();
		this.availability = availability;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	public Cinema getCinema() {
		return cinema;
	}

	public void setCinema(Cinema cinema) {
		this.cinema = cinema;
	}
	
}