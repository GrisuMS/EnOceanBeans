package org.sealsoft.bean.sensor;

public class FHDBean extends SensorBean {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2341847706223542128L;
	private int helligkeit;

	public int getHelligkeit() {
		return helligkeit;
	}

	public void setHelligkeit(int helligkeit) {
		System.out.println("Helligkeit: " + helligkeit + " Lux");
		this.helligkeit = helligkeit;
	}

}
