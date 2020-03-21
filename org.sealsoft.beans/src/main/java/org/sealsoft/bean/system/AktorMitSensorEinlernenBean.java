package org.sealsoft.bean.system;

import java.io.Serializable;

public class AktorMitSensorEinlernenBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8464184564768106604L;
	private String adresseAktor;
	private String adresseSensor;

	public String getAdresseAktor() {
		return adresseAktor;
	}

	public void setAdresseAktor(String adresseAktor) {
		this.adresseAktor = adresseAktor;
	}

	public String getAdresseSensor() {
		return adresseSensor;
	}

	public void setAdresseSensor(String adresseSensor) {
		this.adresseSensor = adresseSensor;
	}

}
