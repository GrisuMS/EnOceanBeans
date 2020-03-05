package org.sealsoft.bean.funktion;

import org.sealsoft.bean.sensor.SensorBean;

public class FunkFSB14Bean extends FunktionBean {
	private static final long serialVersionUID = -6121178646776215633L;
	/**
	 * 0 = stop ; 1 = auf ; 2 = ab
	 */
	int fahrtrichtung;
	int prozentGeschlossen;
	int wendezeit;

	public FunkFSB14Bean() {

	}

	public FunkFSB14Bean(SensorBean sensor, int fahrtrichtung, int prozentGeschlossen, int wendezeit) {
		setFahrtrichtung(fahrtrichtung);
		setSensor(sensor);
		setProzentGeschlossen(prozentGeschlossen);
		setWendezeit(wendezeit);
	}

	public int getProzentGeschlossen() {
		return prozentGeschlossen;
	}

	public void setProzentGeschlossen(int prozentGeschlossen) {
		this.prozentGeschlossen = prozentGeschlossen;
	}

	public int getWendezeit() {
		return wendezeit;
	}

	public void setWendezeit(int wendezeit) {
		this.wendezeit = wendezeit;
	}

	public int getFahrtrichtung() {
		return fahrtrichtung;
	}

	public void setFahrtrichtung(int fahrtrichtung) {
		this.fahrtrichtung = fahrtrichtung;
	}

}
