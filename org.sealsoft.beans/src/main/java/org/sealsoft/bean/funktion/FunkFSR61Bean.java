package org.sealsoft.bean.funktion;

import org.sealsoft.bean.sensor.SensorBean;

public class FunkFSR61Bean extends FunktionBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3744082669881160679L;

	public FunkFSR61Bean(SensorBean sensor, boolean einschalten) {
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
