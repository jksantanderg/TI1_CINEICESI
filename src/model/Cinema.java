package model;

import java.util.ArrayList;

public class Cinema {
	private Movie movie;
	private RoomType roomType;
	public ArrayList<Student> students;
	public ArrayList<Chair> chairs;
	
	public static final Integer capacidadMINISALA = 28;
	public static final Integer capacidadSALAMEDIA = 42;
	
	
	public Cinema() {}
	
	public Cinema(Movie movie, ArrayList<Student> students, ArrayList<Chair> chairs, RoomType roomType) {
		super();
		this.movie = movie;
		this.students = students;
		this.chairs = chairs;
		this.roomType = roomType;
	}
	
	public void EnrollStudent(Student student) {
		students.add(student);
		student.setCinema(this);
		
	}
	
	
	public void SelectChair(Chair chair) {
		chairs.add(chair);
		chair.setCinema(this);
	}

	
	public void AssignChair(Chair chair) {
		chairs.add(chair);
		chair.setCinema(this);
		
	}
	
	/*public Movie SearchMovie(String nameMovie) {
		Movie m = null;
		for(Personal personal : PersonalData.personals) {
    		if(personal.getIdPersonal().equals(id)) {
		
		Iterator <Movie> iterator = ArrayList.iterator();
		while(movies.hasNext) {
			m = ite.next();
			if(m.getNameMovie().equals(nameMovie)){
				return m;
			}
			m = null;
		}
		return m;
	}*/
	
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	public ArrayList<Chair> getChairs() {
		return chairs;
	}
	public void setChairs(ArrayList<Chair> chairs) {
		this.chairs = chairs;
	}
	public RoomType getRoomType() {
		return roomType;
	}
	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}
}
