package org.sealsoft.bean.funktion;

import org.sealsoft.bean.sensor.SensorBean;

public class FunkFSR14Bean extends FunktionBean {
	private static final long serialVersionUID = -9053711685939100266L;

	public FunkFSR14Bean(SensorBean sensor, boolean einschalten) {
		setBeschreibung(sensor.getBeschreibung());
		setSensor(sensor);
		setEinschalten(einschalten);
	}

	private boolean einschalten = false;

	public boolean isEinschalten() {
		return einschalten;
	}

	public void setEinschalten(boolean einschalten) {
		this.einschalten = einschalten;
	}
}
