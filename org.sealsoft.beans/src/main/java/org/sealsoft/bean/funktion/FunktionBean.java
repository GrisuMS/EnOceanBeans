package org.sealsoft.bean.funktion;

import java.util.ArrayList;
import java.util.List;

import org.sealsoft.bean.base.BaseEntityBean;
import org.sealsoft.bean.sensor.SensorBean;
import org.sealsoft.bean.szene.SzeneBean;

public abstract class FunktionBean extends BaseEntityBean {
	private static final long serialVersionUID = 5958209457048355110L;
	private int idFunktion;
	private SensorBean sensor;
	private String beschreibung = "";
	protected List<SzeneBean> szeneAusloerser = new ArrayList<SzeneBean>();
	protected List<SzeneBean> szeneObjekte = new ArrayList<SzeneBean>();

	public int getIdFunktion() {
		return idFunktion;
	}

	public void setIdFunktion(int idFunktion) {
		this.idFunktion = idFunktion;
	}

	public SensorBean getSensor() {
		return sensor;
	}

	public void setSensor(SensorBean sensor) {
		this.sensor = sensor;
		this.beschreibung = sensor.getBeschreibung();
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}
}
