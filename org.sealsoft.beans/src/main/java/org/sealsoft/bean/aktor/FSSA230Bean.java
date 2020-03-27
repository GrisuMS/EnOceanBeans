package org.sealsoft.bean.aktor;

public class FSSA230Bean extends AktorBean {
	/**
	 * 
	 */
	private static final long serialVersionUID = -148159461904737111L;
	public static int AN = 0x70;
	public static int AUS = 0x50;
	private boolean eingeschaltet = false;

	public boolean isEingeschaltet() {
		return eingeschaltet;
	}

	public void setEingeschaltet(boolean eingeschaltet) {
		this.eingeschaltet = eingeschaltet;
	}

	public String toString() {
		return super.toString() + " /// FSSA230Bean Eingeschaltet: " + isEingeschaltet();
	}
}
