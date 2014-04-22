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
public class TableBean1 implements Serializable {  
      
    private final static String[] colors;  
    
    private final static String[] manufacturers;  
      
	
    static {  
        colors = new String[10];  
        colors[0] = "Im Betrieb";  
        colors[1] = "Im Betrieb";  
        colors[2] = "Im Betrieb";  
        colors[3] = "Im Betrieb";  
        colors[4] = "Im Betrieb";  
        colors[5] = "Defekt";  
        colors[6] = "Defekt";  
        colors[7] = "Defekt";  
        colors[8] = "Defekt";  
        colors[9] = "Defekt";  
          
        manufacturers = new String[10];  
        manufacturers[0] = "Thomas Mann";  
        manufacturers[1] = "Hermann Hesse";  
        manufacturers[2] = "Heinrich Heine";  
        manufacturers[3] = "Wolfgang Goethe";  
        manufacturers[4] = "Ersatschrank 123";  
        manufacturers[5] = "Peter Rosegger";  
        manufacturers[6] = "Herman Rollett";  
        manufacturers[7] = "Wolfgang von Schilgen";  
        manufacturers[8] = "Ersatzschrank 767";  
        manufacturers[9] = "Franz Werfel";  
    }  
  

    private List<Bewegung> bewegungSmall;  
      
    public TableBean1() {  
 
    }  
      
    private void populateBewegung(List<Bewegung> list, int size) {  
        for(int i = 0 ; i < size ; i++)  
            list.add(new Bewegung(getRandomModel(), getRandomYear(),  getRandomManufacturer(), getRandomManufacturer(), getRandomColor()));  
    }  
      
    public List<Bewegung> getBewegungSmall() {  
        return bewegungSmall;  
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
    public void createTableBean1() {  
    	bewegungSmall = new ArrayList<Bewegung>();  
          
    	populateBewegung(bewegungSmall, 9);  
    }  
    
}  