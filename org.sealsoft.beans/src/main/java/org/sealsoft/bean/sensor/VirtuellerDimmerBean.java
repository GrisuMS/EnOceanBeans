package org.sealsoft.bean.sensor;

public class VirtuellerDimmerBean extends SensorBean {
	private static final long serialVersionUID = -6974118058050449320L;
	private boolean einschalten = false;
	private int dimmwert = 0;
	private int dimmgeschwindigkeit = 0;

	public boolean isEinschalten() {
		return einschalten;
	}

	public void setEinschalten(boolean einschalten) {
		this.einschalten = einschalten;
	}

	public int getDimmwert() {
		return dimmwert;
	}

	public void setDimmwert(int dimmwert) {
		this.dimmwert = dimmwert;
	}

	public int getDimmgeschwindigkeit() {
		return dimmgeschwindigkeit;
	}

	public void setDimmgeschwindigkeit(int dimmgeschwindigkeit) {
		this.dimmgeschwindigkeit = dimmgeschwindigkeit;
	}

}
