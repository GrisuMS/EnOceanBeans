package org.sealsoft.bean.aktor;

public class FSB14Bean extends AktorBean {
	private static final long serialVersionUID = 1624008736959842216L;
	private int kanal = 0;
	private boolean geschlossen = false;

	private int zeitGeschlossen = 0;

	private int zeitGeschlossen25 = 0;

	private int zeitGeschlossen50 = 0;

	private int zeitGeschlossen75 = 0;

	private int wendezeit = 0;

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

	public int getZeitGeschlossen() {
		return zeitGeschlossen;
	}

	public void setZeitGeschlossen(int zeitGeschlossen) {
		this.zeitGeschlossen = zeitGeschlossen;
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

}
