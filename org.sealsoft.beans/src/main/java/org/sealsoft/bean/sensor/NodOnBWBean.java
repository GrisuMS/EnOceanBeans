package org.sealsoft.bean.sensor;

public class NodOnBWBean extends SensorBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4329167321323776354L;

	private int helligkeit;
	private boolean ausgeloest;
	private double spannung;

	public int getHelligkeit() {
		return helligkeit;
	}

	public void setHelligkeit(int helligkeit) {
		this.helligkeit = helligkeit;
	}

	public boolean isAusgeloest() {
		return ausgeloest;
	}

	public void setAusgeloest(boolean ausgeloest) {
		this.ausgeloest = ausgeloest;
	}

	public double getSpannung() {
		return spannung;
	}

	public void setSpannung(double spannung) {
		this.spannung = spannung;
	}

	@Override
	public String toString() {
		return super.toString() + " Bewegung:" + ausgeloest + " Helligkeit:" + helligkeit + " LUX Sannung:" + spannung
				+ "V";
	}
}
