package org.sealsoft.bean.aktor;

import java.util.ArrayList;
import java.util.List;

import org.sealsoft.bean.base.BaseEntityBean;
import org.sealsoft.bean.sensor.SensorBean;

public abstract class AktorBean extends BaseEntityBean {
	private static final long serialVersionUID = 6608494310804145056L;

	protected String adresse = "";

	protected List<SensorBean> sensoren = new ArrayList<SensorBean>();

	protected String kurzbezeichnung = "";
	protected String beschreibung = "";

	public AktorBean() {
	}

	public List<SensorBean> getSensoren() {
		return sensoren;
	}

	public void setSensoren(List<SensorBean> sensoren) {
		this.sensoren = sensoren;
	}

	public void addSensor(SensorBean sensor) {
		this.sensoren.add(sensor);
	}

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

	public String toString() {
		return super.toString() + " Aktor: " + getBeschreibung() + " Adresse: " + getAdresse();

	}

}
