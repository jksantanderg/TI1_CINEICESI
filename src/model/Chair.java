package model;

public class Chair {
	private boolean availability;
	
	private Cinema cinema;

	/**
	 * @param availability
	 */
	public Chair(boolean availability) {
		super();
		this.availability = availability;
	}

	/**
	 * @return the availability
	 */
	public boolean isAvailability() {
		return availability;
	}

	/**
	 * @param availability the availability to set
	 */
	public void setAvailability(boolean availability) {
		this.availability = availability;
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