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
public class SimTableBean implements Serializable {  
      


    private List<SimKarte> simKarteSmall;  
      
    private List<SimKarte> filteredSimKarte;  
    
    public SimTableBean() {  
 
    }  
      

    public List<SimKarte> getFilteredSimKarte() {  
        return filteredSimKarte;  
    }  
  
    public void setFilteredSimKarte(List<SimKarte> filteredSimKarte) {  
        this.filteredSimKarte = filteredSimKarte;  
    }  
    
    public List<SimKarte> getSimKarteSmall() {  
        return simKarteSmall;  
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
    	simKarteSmall = new ArrayList<SimKarte>();  
    	
    	simKarteSmall.add(new SimKarte("12234213332", "++436642343223", "1622344",
    			"Thomas Mann", "1232d34dff3343", new Date()));
    	simKarteSmall.add(new SimKarte("43434545453", "++4366455333332", "162355",
    			"Karl May", "12sdfsds324232", new Date()));
    	simKarteSmall.add(new SimKarte("1224511245533", "++4366422113444", "1124445",
    			"Hermann Hesse", "1244334s34232d", new Date()));



    }  
    
    
}  