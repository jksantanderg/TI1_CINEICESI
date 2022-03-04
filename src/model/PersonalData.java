package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class PersonalData {
	private Personal personal;
	private ArrayList<Personal> personals;
	
	public PersonalData() {
		personals = new ArrayList<>();
	}
	
	public void addPersonal(Personal personal) {
		personals.add(personal);
	}


	public void date() {
	
		addPersonal(new Personal ("1107"));
		addPersonal(new Personal ("0000"));
		addPersonal(new Personal ("1100"));
			
		saveData();
	}
	
	
	public void saveData()  {
		
		try {
			File file = new File("personaldata.temp");
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
			File file = new File("personaldata.temp");
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object object = ois.readObject();
			PersonalData data = (PersonalData) object;
			this.personal = data.personal;
			
				
			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			}catch (IOException e) {
				
				e.printStackTrace();
			}
	}
	
}
