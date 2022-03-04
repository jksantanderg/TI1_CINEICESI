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

public class FilmData {
	public Film film;
	
	public static ObservableList<Film> data = FXCollections.observableArrayList();

	private ArrayList<Film> films;
	
	public FilmData() {
		films = new ArrayList<>();
	}
	
	public void addFilm(Film film) {
		films.add(film);
	}
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
	
	public void LoadData() {
		try {
			File file = new File("filmdata.temp");
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object object = ois.readObject();
			FilmData data = (FilmData) object;
			this.film = data.film;
			
				
			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			}catch (IOException e) {
				
				e.printStackTrace();
			}
	}

}
