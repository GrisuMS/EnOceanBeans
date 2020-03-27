package org.sealsoft.bean.sensor;

public class FTKEBean extends SensorBean {
	/**
	 * 
	 */
	private static final long serialVersionUID = -347610471308968130L;
	public static byte OFFEN = (byte) 0xE0;
	public static byte GESCHLOSSEN = (byte) 0xF0;

	private boolean geschlossen;

	public boolean isGeschlossen() {
		return geschlossen;
	}

	public void setGeschlossen(boolean geschlossen) {
		this.geschlossen = geschlossen;
	}

	public String toString() {
		return super.toString() + "Geschlossen: " + geschlossen;
	}
}
