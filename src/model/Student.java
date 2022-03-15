package model;

public class Student {
	
	private String name;
	private String id;
	
	private Cinema cinema;

	/**
	 * @param name
	 * @param id
	 * @param cinema
	 */
	public Student(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
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
