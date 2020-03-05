package org.sealsoft.bean.system;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.sealsoft.bean.aktor.AktorBean;
import org.sealsoft.bean.funktion.FunktionBean;
import org.sealsoft.bean.sensor.SensorBean;
import org.sealsoft.bean.szene.SzeneBean;

public class SystemBean implements Serializable {
	private static final long serialVersionUID = -5963923837362774980L;
	private List<AktorBean> aktoren = new ArrayList<AktorBean>();
	private List<SensorBean> sensoren = new ArrayList<SensorBean>();
	private List<FunktionBean> funktionen = new ArrayList<FunktionBean>();
	private List<SzeneBean> szenen = new ArrayList<SzeneBean>();

	public List<AktorBean> getAktoren() {
		return aktoren;
	}

	public void setAktoren(List<AktorBean> aktoren) {
		this.aktoren = aktoren;
	}

	public List<SensorBean> getSensoren() {
		return sensoren;
	}

	public void setSensoren(List<SensorBean> sensoren) {
		this.sensoren = sensoren;
	}

	public List<FunktionBean> getFunktionen() {
		return funktionen;
	}

	public void setFunktionen(List<FunktionBean> funktionen) {
		this.funktionen = funktionen;
	}

	public List<SzeneBean> getSzenen() {
		return szenen;
	}

	public void setSzenen(List<SzeneBean> szenen) {
		this.szenen = szenen;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
