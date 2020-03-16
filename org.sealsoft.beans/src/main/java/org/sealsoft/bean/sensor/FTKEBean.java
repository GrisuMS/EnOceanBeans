package org.sealsoft.bean.sensor;

public class FTKEBean extends SensorBean {
	/**
	 * 
	 */
	private static final long serialVersionUID = 143553187527847300L;
	private String zu = "F0";
	private String offen = "E0";

	public String getZu() {
		return zu;
	}

	public void setZu(String zu) {
		this.zu = zu;
	}

	public String getOffen() {
		return offen;
	}

	public void setOffen(String offen) {
		this.offen = offen;
	}
}
