package org.sealsoft.bean.sensor;

public class VirtuellerRichtungstasterTasterBean extends SensorBean {
	/**
	* 
	*/
	private static final long serialVersionUID = -5794132749010703117L;
	private static byte OBEN = (byte) 0x70;
	private static byte UNTEN = (byte) 0x50;

	private boolean oben;
	private boolean unten;

	public boolean isOben() {
		return oben;
	}

	public void setOben(boolean oben) {
		this.oben = oben;
	}

	public boolean isUnten() {
		return unten;
	}

	public void setUnten(boolean unten) {
		this.unten = unten;
	}

}
