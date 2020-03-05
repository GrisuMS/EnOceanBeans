package org.sealsoft.bean.sensor;

public class VirtuellerBeschattungBean extends SensorBean {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7799056761323643963L;
	/**
	 * 0 = Stop, 1 = hoch, 2, runter
	 */
	private int kommando = 0;
	private int fahrzeit = 0;
	private int wendezeit = 0;

	public int getKommando() {
		return kommando;
	}

	public void setKommando(int kommando) {
		this.kommando = kommando;
	}

	public int getFahrzeit() {
		return fahrzeit;
	}

	public void setFahrzeit(int fahrzeit) {
		this.fahrzeit = fahrzeit;
	}

	public int getWendezeit() {
		return wendezeit;
	}

	public void setWendezeit(int wendezeit) {
		this.wendezeit = wendezeit;
	}

}
