package org.sealsoft.bean.sensor;

public class FSM61Bean extends SensorBean {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6551161295498840527L;
	public static int AN = 0x50;
	public static int AUS = 0x00;

	private boolean ausgeloest;

	public boolean isAusgeloest() {
		return ausgeloest;
	}

	public void setAusgeloest(boolean ausgeloest) {
		this.ausgeloest = ausgeloest;
	}

	public String toString() {
		return super.toString() + "Ausgelöst: " + ausgeloest;
	}

}
