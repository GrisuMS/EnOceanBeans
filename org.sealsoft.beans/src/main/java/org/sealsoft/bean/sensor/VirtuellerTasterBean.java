package org.sealsoft.bean.sensor;

public class VirtuellerTasterBean extends SensorBean {
	private static final long serialVersionUID = 2399165827841012373L;
	private boolean einschalten = false;

	public boolean isEinschalten() {
		return einschalten;
	}

	public void setEinschalten(boolean einschalten) {
		this.einschalten = einschalten;
	}
}
