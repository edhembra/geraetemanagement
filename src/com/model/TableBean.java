package com.model;

import java.io.Serializable;  
import java.sql.Timestamp;
import java.util.ArrayList;  
import java.util.Date;
import java.util.List;  
import java.util.Random;
import java.util.UUID;  

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
  
@ManagedBean
@RequestScoped
public class TableBean implements Serializable {  
      
    private final static String[] colors;  
    
    private final static String[] manufacturers;  
      
	
    static {  
        colors = new String[10];  
        colors[0] = "Display ist kaputt!";  
        colors[1] = "Gerät lässt sich nicht mehr einschalten!";  
        colors[2] = "xxxx";  
        colors[3] = "SW Problem";  
        colors[4] = "SW Problem";  
        colors[5] = "Gerät ist ausgefallen.";  
        colors[6] = "Gerät defekt!";  
        colors[7] = "xxx";  
        colors[8] = "xxxx";  
        colors[9] = "xxxx";  
          
        manufacturers = new String[10];  
        manufacturers[0] = "Thomas Mann";  
        manufacturers[1] = "Hermann Hesse";  
        manufacturers[2] = "Heinrich Heine";  
        manufacturers[3] = "Wolfgang Goethe";  
        manufacturers[4] = "Peter Maiwald";  
        manufacturers[5] = "Peter Rosegger";  
        manufacturers[6] = "Herman Rollett";  
        manufacturers[7] = "Wolfgang von Schilgen";  
        manufacturers[8] = "Adalbert Stifter";  
        manufacturers[9] = "Franz Werfel";  
    }  
  

    private List<Car> carsSmall;  
      
    public TableBean() {  
 
    }  
      
    private void populateRandomCars(List<Car> list, int size) {  
        for(int i = 0 ; i < size ; i++)  
            list.add(new Car(getRandomModel(), getRandomYear(), getRandomManufacturer(), getRandomColor()));  
    }  
      
    public List<Car> getCarsSmall() {  
        return carsSmall;  
    }  
  
    private String getRandomYear() {  
    	long rangebegin = Timestamp.valueOf("2014-03-01 00:00:00").getTime();
    	long rangeend = Timestamp.valueOf("2014-04-14 00:58:00").getTime();
    	long diff = rangeend - rangebegin + 1;
    	Timestamp rand = new Timestamp(rangebegin + (long)(Math.random() * diff));
        return rand.toString();  
    }  
      
    private String getRandomColor() {  
        return colors[(int) (Math.random() * 10)];  
    }  
      
    private String getRandomManufacturer() {  
        return manufacturers[(int) (Math.random() * 10)];  
    }  
      
    private String getRandomModel() {  
        return UUID.randomUUID().toString().substring(0, 8);  
    }  
    
    @PostConstruct
    public void createTableBean() {  
        carsSmall = new ArrayList<Car>();  
          
        populateRandomCars(carsSmall, 9);  
    }  
    
}  