package org.sealsoft.bean.aktor;

public class BrennstuhlBean extends AktorBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1701009065043336267L;
	private boolean eingeschaltet;
	private String einschaltenCode;
	private String ausschaltenCode;

	public boolean isEingeschaltet() {
		return eingeschaltet;
	}

	public void setEingeschaltet(boolean eingeschaltet) {
		this.eingeschaltet = eingeschaltet;
	}

	public String getEinschaltenCode() {
		return einschaltenCode;
	}

	public void setEinschaltenCode(String einschaltenCode) {
		this.einschaltenCode = einschaltenCode;
	}

	public String getAusschaltenCode() {
		return ausschaltenCode;
	}

	public void setAusschaltenCode(String ausschaltenCode) {
		this.ausschaltenCode = ausschaltenCode;
	}

}
