package org.sealsoft.bean.funktion;

import org.sealsoft.bean.sensor.SensorBean;

public class FunkFT65Bean extends FunktionBean {
	private static final long serialVersionUID = -3957093010276592545L;
	public static String OBEN = "70";
	public static String UNTEN = "50";
	private String gedrueckterTaster = "";

	public FunkFT65Bean() {

	}

	public FunkFT65Bean(SensorBean sensor, String gedrueckterTaster) {
		setSensor(sensor);
		setGedrueckterTaster(gedrueckterTaster);

	}

	public String getGedrueckterTaster() {
		return gedrueckterTaster;
	}

	public void setGedrueckterTaster(String gedrueckterTaster) {
		this.gedrueckterTaster = gedrueckterTaster;
	}

}
