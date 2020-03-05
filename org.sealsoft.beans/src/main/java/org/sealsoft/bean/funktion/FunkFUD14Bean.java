package org.sealsoft.bean.funktion;

import org.sealsoft.bean.sensor.SensorBean;

public class FunkFUD14Bean extends FunktionBean {
	private static final long serialVersionUID = -4195472795736162665L;

	private boolean einschalten = false;

	private int dimmgeschwindigkeit = 0;

	private int dimmwert = 0;

	public FunkFUD14Bean() {

	}

	public FunkFUD14Bean(SensorBean sensor, boolean einschalten, int dimmgeschwindigkeit, int dimmwert) {
		setSensor(sensor);
		setEinschalten(einschalten);
		setDimmgeschwindigkeit(dimmgeschwindigkeit);
		setDimmwert(dimmwert);
	}

	public boolean isEinschalten() {
		return einschalten;
	}

	public void setEinschalten(boolean einschalten) {
		this.einschalten = einschalten;
	}

	public int getDimmgeschwindigkeit() {
		return dimmgeschwindigkeit;
	}

	public void setDimmgeschwindigkeit(int dimmgeschwindigkeit) {
		this.dimmgeschwindigkeit = dimmgeschwindigkeit;
	}

	public int getDimmwert() {
		return dimmwert;
	}

	public void setDimmwert(int dimmwert) {
		this.dimmwert = dimmwert;
	}

}
