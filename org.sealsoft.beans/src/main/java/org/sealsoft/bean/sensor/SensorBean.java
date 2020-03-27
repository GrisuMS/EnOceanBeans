package org.sealsoft.bean.sensor;

import java.io.Serializable;

import org.sealsoft.bean.base.BaseEntityBean;

public abstract class SensorBean extends BaseEntityBean implements Serializable {
	private static final long serialVersionUID = 6963458790224933490L;

	String adresse;

	boolean virtuell = false;
	String kurzbezeichnung = "";
	String beschreibung = "";

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getKurzbezeichnung() {
		return kurzbezeichnung;
	}

	public void setKurzbezeichnung(String kurzbezeichnung) {
		this.kurzbezeichnung = kurzbezeichnung;
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	public boolean isVirtuell() {
		return virtuell;
	}

	public void setVirtuell(boolean virtuell) {
		this.virtuell = virtuell;
	}

	public String toString() {
		return beschreibung + " <<<<< ";
	}
}
