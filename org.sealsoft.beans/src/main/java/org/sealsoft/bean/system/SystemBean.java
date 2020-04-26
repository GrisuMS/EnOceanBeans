package org.sealsoft.bean.system;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.sealsoft.bean.aktor.AktorBean;
import org.sealsoft.bean.aktor.AktorFavoritenBean;
import org.sealsoft.bean.aktor.FSR61GarageBean;
import org.sealsoft.bean.funktion.FunktionBean;
import org.sealsoft.bean.sensor.SensorBean;
import org.sealsoft.bean.szene.SzeneBean;

public class SystemBean implements Serializable {
	private static final long serialVersionUID = -5963923837362774980L;
	private List<AktorBean> aktoren = new ArrayList<AktorBean>();
	private List<SensorBean> sensoren = new ArrayList<SensorBean>();
	private List<FunktionBean> funktionen = new ArrayList<FunktionBean>();
	private List<SzeneBean> szenen = new ArrayList<SzeneBean>();
	private List<AktorFavoritenBean> aktorFavoriten = new ArrayList<AktorFavoritenBean>();

	public List<AktorBean> getAktoren() {
		return aktoren;
	}

	public void setAktoren(List<AktorBean> aktoren) {
		this.aktoren = aktoren;
	}

	public List<SensorBean> getSensoren() {
		return sensoren;
	}

	public void setSensoren(List<SensorBean> sensoren) {
		this.sensoren = sensoren;
	}

	public List<FunktionBean> getFunktionen() {
		return funktionen;
	}

	public void setFunktionen(List<FunktionBean> funktionen) {
		this.funktionen = funktionen;
	}

	public List<SzeneBean> getSzenen() {
		return szenen;
	}

	public void setSzenen(List<SzeneBean> szenen) {
		this.szenen = szenen;
	}

	public List<AktorFavoritenBean> getAktorFavoriten() {
		return aktorFavoriten;
	}

	public void setAktorFavoriten(List<AktorFavoritenBean> aktorFavoriten) {
		this.aktorFavoriten = aktorFavoriten;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public AktorBean findAktorForZustandssensor(String sensorAdrresse) {
		for (AktorBean aktor : aktoren) {
			if (aktor instanceof FSR61GarageBean) {
				FSR61GarageBean ak = (FSR61GarageBean) aktor;
				if (ak.getZustandsSensor() != null
						&& ak.getZustandsSensor().getAdresse().compareTo(sensorAdrresse) == 0) {
					return ak;
				}
			}
		}
		return null;
	}

	/**
	 * 
	 * @param sensorAdresse Die Adresse des Sensors, der die Szene ausgelöst hat
	 * @return
	 */
	public List<SzeneBean> findSzenen(String sensorAdresse) {
		List<SzeneBean> liste = new ArrayList<SzeneBean>();
		for (SzeneBean szene : this.szenen) {
			for (FunktionBean funktion : szene.getAusloeser()) {
				if (sensorAdresse.compareTo(funktion.getSensor().getAdresse()) == 0) {
					liste.add(szene);
				}
			}
		}
		return liste;
	}

	public SensorBean findSensor(String adresseSensor) {
		for (SensorBean sb : this.sensoren) {
			if (adresseSensor.compareTo(sb.getAdresse()) == 0) {
				return sb;
			}
		}
		return null;
	}

	public AktorBean findAktor(String adresseAktor) {
		for (AktorBean ab : this.aktoren) {
			if (adresseAktor.compareTo(ab.getAdresse()) == 0) {
				return ab;
			}
		}
		return null;
	}

	public List<AktorBean> findAktorenWithSensorID(String sensorID) {
		List<AktorBean> lab = new ArrayList<AktorBean>();
		for (AktorBean ab : this.aktoren) {
			for (SensorBean sb : ab.getSensoren()) {
				if (sensorID.compareTo(sb.getAdresse()) == 0) {
					lab.add(ab);
				}
			}
		}
		return lab;
	}

	public Optional<AktorFavoritenBean> findAktorVavorit(String bezeichnung) {
		return aktorFavoriten.stream().filter(a -> a.getBeschreibung().equalsIgnoreCase(bezeichnung)).findFirst();
	}
}
