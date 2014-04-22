package com.model;

import java.util.Date;

public class SimKarte {
	
	
	private long id;
	private String seriennummer;
	private String rufnummer;
	private String personalnummer;
	private String personalname;
	private String zugewiesenesGeraet;
	private Date lastUpdated;
	
	
	public SimKarte(String seriennummer, String rufnummer,
			String personalnummer, String personalname,
			String zugewiesenesGeraet, Date lastUpdated) {
		super();
		this.seriennummer = seriennummer;
		this.rufnummer = rufnummer;
		this.personalnummer = personalnummer;
		this.personalname = personalname;
		this.zugewiesenesGeraet = zugewiesenesGeraet;
		this.lastUpdated = lastUpdated;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getSeriennummer() {
		return seriennummer;
	}


	public void setSeriennummer(String seriennummer) {
		this.seriennummer = seriennummer;
	}


	public String getRufnummer() {
		return rufnummer;
	}


	public void setRufnummer(String rufnummer) {
		this.rufnummer = rufnummer;
	}


	public String getPersonalnummer() {
		return personalnummer;
	}


	public void setPersonalnummer(String personalnummer) {
		this.personalnummer = personalnummer;
	}


	public String getPersonalname() {
		return personalname;
	}


	public void setPersonalname(String personalname) {
		this.personalname = personalname;
	}


	public String getZugewiesenesGeraet() {
		return zugewiesenesGeraet;
	}


	public void setZugewiesenesGeraet(String zugewiesenesGeraet) {
		this.zugewiesenesGeraet = zugewiesenesGeraet;
	}


	public Date getLastUpdated() {
		return lastUpdated;
	}


	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	
	
	
	
	

	
	

}
