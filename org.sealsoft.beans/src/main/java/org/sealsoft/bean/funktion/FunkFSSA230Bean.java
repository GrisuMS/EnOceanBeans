package org.sealsoft.bean.funktion;

import org.sealsoft.bean.sensor.SensorBean;

public class FunkFSSA230Bean extends FunktionBean {

	private static final long serialVersionUID = 2913862698141564645L;

	public FunkFSSA230Bean(SensorBean sensor, boolean einschalten) {
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
