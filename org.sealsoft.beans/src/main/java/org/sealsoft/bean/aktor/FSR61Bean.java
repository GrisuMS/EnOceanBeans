package org.sealsoft.bean.aktor;

public class FSR61Bean extends AktorBean {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8161933892554924915L;
	private boolean eingeschaltet = false;

	public boolean isEingeschaltet() {
		return eingeschaltet;
	}

	public void setEingeschaltet(boolean eingeschaltet) {
		this.eingeschaltet = eingeschaltet;
	}

	public String toString() {
		return super.toString() + " /// FSR61 Eingeschaltet: " + isEingeschaltet();
	}
}
