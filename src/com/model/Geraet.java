package com.model;

import java.util.Date;

public class Geraet {
	
	
	private long id;
	private String seriennummer;
	private String macadresse;
	private String geraetetyp;
	private String betriebssystem;
	private String aktuelleVersion;
	private String updateVersion;
	private String anmerkung;
	private String personalnummer;
	private String personalname;
	private boolean gesperrt;
	private String beschreibung;
	private String voreingestellteRolle;
	private String heimatStandort;
	private String derzeitigerStandort;
	private Date lastUpdated;
	
	
	public Geraet(String seriennummer, String macadresse, String geraetetyp,
			String betriebssystem, String aktuelleVersion,
			String updateVersion, String anmerkung, String personalnummer,
			String personalname, boolean gesperrt, String beschreibung,
			String voreingestellteRolle, String heimatStandort,
			String derzeitigerStandort, Date lastUpdated) {
		super();
		this.seriennummer = seriennummer;
		this.macadresse = macadresse;
		this.geraetetyp = geraetetyp;
		this.betriebssystem = betriebssystem;
		this.aktuelleVersion = aktuelleVersion;
		this.updateVersion = updateVersion;
		this.anmerkung = anmerkung;
		this.personalnummer = personalnummer;
		this.personalname = personalname;
		this.gesperrt = gesperrt;
		this.beschreibung = beschreibung;
		this.voreingestellteRolle = voreingestellteRolle;
		this.heimatStandort = heimatStandort;
		this.derzeitigerStandort = derzeitigerStandort;
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


	public void setSeriennumer(String seriennummer) {
		this.seriennummer = seriennummer;
	}


	public String getMacadresse() {
		return macadresse;
	}


	public void setMacadresse(String macadresse) {
		this.macadresse = macadresse;
	}


	public String getGeraetetyp() {
		return geraetetyp;
	}


	public void setGeraetetyp(String geraetetyp) {
		this.geraetetyp = geraetetyp;
	}


	public String getBetriebssystem() {
		return betriebssystem;
	}


	public void setBetriebssystem(String betriebssystem) {
		this.betriebssystem = betriebssystem;
	}


	public String getAktuelleVersion() {
		return aktuelleVersion;
	}


	public void setAktuelleVersion(String aktuelleVersion) {
		this.aktuelleVersion = aktuelleVersion;
	}


	public String getUpdateVersion() {
		return updateVersion;
	}


	public void setUpdateVersion(String updateVersion) {
		this.updateVersion = updateVersion;
	}


	public String getAnmerkung() {
		return anmerkung;
	}


	public void setAnmerkung(String anmerkung) {
		this.anmerkung = anmerkung;
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


	public boolean getGesperrt() {
		return gesperrt;
	}


	public void setGesperrt(boolean gesperrt) {
		this.gesperrt = gesperrt;
	}


	public String getBeschreibung() {
		return beschreibung;
	}


	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}


	public String getVoreingestellteRolle() {
		return voreingestellteRolle;
	}


	public void setVoreingestellteRolle(String voreingestellteRolle) {
		this.voreingestellteRolle = voreingestellteRolle;
	}


	public String getHeimatStandort() {
		return heimatStandort;
	}


	public void setHeimatStandort(String heimatStandort) {
		this.heimatStandort = heimatStandort;
	}


	public String getDerzeitigerStandort() {
		return derzeitigerStandort;
	}


	public void setDerzeitigerStandort(String derzeitigerStandort) {
		this.derzeitigerStandort = derzeitigerStandort;
	}


	public Date getLastUpdated() {
		return lastUpdated;
	}


	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	
	
	

	
	

}
