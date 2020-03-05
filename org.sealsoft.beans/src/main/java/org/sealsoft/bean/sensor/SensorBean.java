package org.sealsoft.bean.sensor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.sealsoft.bean.aktor.AktorBean;
import org.sealsoft.bean.base.BaseEntityBean;

public abstract class SensorBean extends BaseEntityBean implements Serializable {
	private static final long serialVersionUID = 6963458790224933490L;

	String adresse;

	List<AktorBean> aktoren = new ArrayList<AktorBean>();

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

	public List<AktorBean> getAktoren() {
		return aktoren;
	}

	public void setAktoren(List<AktorBean> aktoren) {
		this.aktoren = aktoren;
	}

	public void addAktor(AktorBean aktor) {
		this.aktoren.add(aktor);
	}
}
