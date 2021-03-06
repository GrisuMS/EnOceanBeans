package org.sealsoft.bean.aktor;

public class FSB14Bean extends AktorBean {
	// Zeiten in 100ms 24 = 2,4 sekunden
	public static int HOCH = 1;
	public static int STOP = 0;
	public static int RUNTER = 2;

	private static final long serialVersionUID = 1624008736959842216L;
	private int kanal = 0;
	private boolean geschlossen = false;
	private boolean offen = false;

	private int aktuelleFahrtrichtung = 0;
	private int aktuelleFahrzeit = 0;
	private int aktuellProzentGeschlossen = 0;

	private int zeitGeschlossen100 = 0;

	private int zeitGeschlossen25 = 0;

	private int zeitGeschlossen50 = 0;

	private int zeitGeschlossen75 = 0;

	private int wendezeit = 0;

	public int getAktuellProzentGeschlossen() {
		return aktuellProzentGeschlossen;
	}

	public void setAktuellProzentGeschlossen(int aktuellProzentGeschlossen) {
		this.aktuellProzentGeschlossen = aktuellProzentGeschlossen;
	}

	public int getAktuelleFahrzeit() {
		return aktuelleFahrzeit;
	}

	public void setAktuelleFahrzeit(int aktuelleFahrzeit) {
		this.aktuelleFahrzeit = aktuelleFahrzeit;
	}

	public int getAktuelleFahrtrichtung() {
		return aktuelleFahrtrichtung;
	}

	public void setAktuelleFahrtrichtung(int aktuelleFahrtrichtung) {
		this.aktuelleFahrtrichtung = aktuelleFahrtrichtung;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getKanal() {
		return kanal;
	}

	public void setKanal(int kanal) {
		this.kanal = kanal;
	}

	public boolean isGeschlossen() {
		return geschlossen;
	}

	public void setGeschlossen(boolean geschlossen) {
		this.geschlossen = geschlossen;
	}

	public boolean isOffen() {
		return offen;
	}

	public void setOffen(boolean offen) {
		this.offen = offen;
	}

	public int getZeitGeschlossen100() {
		return zeitGeschlossen100;
	}

	public void setZeitGeschlossen100(int zeitGeschlossen) {
		this.zeitGeschlossen100 = zeitGeschlossen;
	}

	public int getZeitGeschlossen25() {
		return zeitGeschlossen25;
	}

	public void setZeitGeschlossen25(int zeitGeschlossen25) {
		this.zeitGeschlossen25 = zeitGeschlossen25;
	}

	public int getZeitGeschlossen50() {
		return zeitGeschlossen50;
	}

	public void setZeitGeschlossen50(int zeitGeschlossen50) {
		this.zeitGeschlossen50 = zeitGeschlossen50;
	}

	public int getZeitGeschlossen75() {
		return zeitGeschlossen75;
	}

	public void setZeitGeschlossen75(int zeitGeschlossen75) {
		this.zeitGeschlossen75 = zeitGeschlossen75;
	}

	public int getWendezeit() {
		return wendezeit;
	}

	public void setWendezeit(int wendezeit) {
		this.wendezeit = wendezeit;
	}

	public String getStringRichtung() {
		if (aktuelleFahrtrichtung == RUNTER) {
			return "Runter";
		} else if (aktuelleFahrtrichtung == HOCH) {
			return "Hoch";
		}
		return "Stop";
	}

	public String toString() {
		return super.toString() + " Richtung: " + getStringRichtung() + "  Fahrzeitgeschlossen: " + aktuelleFahrzeit
				+ "\n Offen: " + offen + "  Geschlossen: " + geschlossen;
	}
}
