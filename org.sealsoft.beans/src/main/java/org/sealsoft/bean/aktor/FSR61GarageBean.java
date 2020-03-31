package org.sealsoft.bean.aktor;

import org.sealsoft.bean.sensor.SensorBean;

public class FSR61GarageBean extends FSR61Bean {

	/**
	 * 
	 */
	private static final long serialVersionUID = -151232375537030343L;

	private boolean isGeschlossen = false;

	private SensorBean zustandsSensor;

	public SensorBean getZustandsSensor() {
		return zustandsSensor;
	}

	public void setZustandsSensor(SensorBean zustandsSensor) {
		this.zustandsSensor = zustandsSensor;
	}

	public boolean isGeschlossen() {
		return isGeschlossen;
	}

	public void setGeschlossen(boolean isGeschlossen) {
		this.isGeschlossen = isGeschlossen;
	}

	public String toString() {
		return super.toString() + " /// FSR61 Eingeschaltet: " + isEingeschaltet();
	}
}
