package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MovieData {
	public Movie film;
	
	public static ObservableList<Movie> data = FXCollections.observableArrayList();

	private ArrayList<Movie> films;
	
	/**
	 * 
	 */
	public MovieData() {
		films = new ArrayList<>();
	}
	
	/**
	 * this method create a new movie
	 * @param student
	 */
	public void addFilm(Movie film) {
		films.add(film);
	}
	
	/**
	 * this method saves the information
	 *
	 */
	public void saveData()  {
		
		try {
			File file = new File("filmdata.temp");
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(this);
			oos.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	/**
	 * this method load the information
	 * 
	 */
	public void LoadData() {
		try {
			File file = new File("filmdata.temp");
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object object = ois.readObject();
			MovieData data = (MovieData) object;
			this.film = data.film;
			
				
			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			}catch (IOException e) {
				
				e.printStackTrace();
			}
	}

}
