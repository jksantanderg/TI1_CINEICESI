package model;

import java.util.ArrayList;

public class Cinema {
	private Movie movie;
	private RoomType roomType;
	public static ArrayList<Student> students;
	public static ArrayList<Chair> chairs;
	
	public Cinema() {}
	
	/**
	 * @param movie
	 * @param roomType
	 * @param students
	 * @param chairs
	 */
	public Cinema(Movie movie, RoomType roomType, ArrayList<Student> students, ArrayList<Chair> chairs) {
		super();
		this.movie = movie;
		this.roomType = roomType;
		this.students = students;
		this.chairs = chairs;
	}


	/**
	 * this method assigns the student in the cinema class
	 * @param student
	 */
	public void EnrollStudent(Student student) {
		students.add(student);
		student.setCinema(this);
		
	}

	/**
	 *this method assigns the chair in the cinema class
	 * @param chair
	 */
	public void AssignChair(Chair chair) {
		chairs.add(chair);
		chair.setCinema(this);
		
	}

	/**
	 * @return the movie
	 */
	public Movie getMovie() {
		return movie;
	}

	/**
	 * @param movie the movie to set
	 */
	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	/**
	 * @return the roomType
	 */
	public RoomType getRoomType() {
		return roomType;
	}

	/**
	 * @param roomType the roomType to set
	 */
	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}

	/**
	 * @return the students
	 */
	public ArrayList<Student> getStudents() {
		return students;
	}

	/**
	 * @param students the students to set
	 */
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	/**
	 * @return the chairs
	 */
	public ArrayList<Chair> getChairs() {
		return chairs;
	}

	/**
	 * @param chairs the chairs to set
	 */
	public void setChairs(ArrayList<Chair> chairs) {
		this.chairs = chairs;
	}
}
