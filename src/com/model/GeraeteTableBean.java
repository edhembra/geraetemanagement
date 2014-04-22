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
import javax.faces.model.SelectItem;
  
@ManagedBean
@RequestScoped
public class GeraeteTableBean implements Serializable {  
      


    private List<Geraet> geraeteSmall;  
      
    private List<Geraet> filteredGeraet;  
    
    
    public GeraeteTableBean() {  
 
    }  
      

    public List<Geraet> getFilteredGeraet() {  
        return filteredGeraet;  
    }  
  
    public void setFilteredGeraet(List<Geraet> filteredGeraet) {  
        this.filteredGeraet = filteredGeraet;  
    }  
    
    public List<Geraet> getGeraeteSmall() {  
        return geraeteSmall;  
    }  
  
    private SelectItem[] createFilterOptions(String[] data)  {  
        SelectItem[] options = new SelectItem[data.length + 1];  
  
        options[0] = new SelectItem("", "Select");  
        for(int i = 0; i < data.length; i++) {  
            options[i + 1] = new SelectItem(data[i], data[i]);  
        }  
  
        return options;  
    }  
    
    
    @PostConstruct
    public void createGeraetTableBean() {  
    	geraeteSmall = new ArrayList<Geraet>();  
    	
    	geraeteSmall.add(new Geraet("1232d34dff3343", "00-14-22-01-23-45", "Tablet",
    			"Android 4.4.0 KitKat", "SW Version 1.0.1", "SW Version 2.0.0", "Ersatzgerät - Bitte zuückbringen!",
    			"00210223", "Heinrich Heine", false, "Verkaufsgerät", "Ersatzgerät", "Wien West", "Graz HBF", new Date()));
    	
    	geraeteSmall.add(new Geraet("1adas2d34dff3343", "01-14-55-01-23-45", "Handy",
    			"Android 4.4.1 KitKat", "SW Version 4.5.1", "SW Version 4.5.2", "",
    			"0032223", "Thomas Mann", false, "persönliches Handy", "Persönliches Gerät", "Wien HBF", "Wien HBF", new Date()));
    	
    	geraeteSmall.add(new Geraet("1232d34fgdfgf43", "02-56-22-01-23-45", "Drucker",
    			"OS 122", "SW Version 4.0", "SW Version 4.0", "",
    			"0011223", "Hermann Hesse", true, "Drucker", "persönliches Gerät", "Linz HBF", "Linz HBF", new Date()));
    	
    	geraeteSmall.add(new Geraet("1232dsdas3322", "03-46-11-01-23-11", "PIN Gerät",
    			"OS 12", "SW Version 1.3", "SW Version 1.3", "",
    			"00210223", "Heinrich Heine", false, "Verkaufsgerät", "persönliches Gerät", "Graz HBF", "Graz HBF", new Date()));
    	    	

    }  
    
    
}  