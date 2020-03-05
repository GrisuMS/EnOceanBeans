package org.sealsoft.bean.aktor;

public class FSR14Bean extends AktorBean {
	private static final long serialVersionUID = 2908985492084759498L;
	private boolean eingeschaltet = false;
	private int kanal = 0;

	public boolean isEingeschaltet() {
		return eingeschaltet;
	}

	public void setEingeschaltet(boolean eingeschaltet) {
		this.eingeschaltet = eingeschaltet;
	}

	public int getKanal() {
		return kanal;
	}

	public void setKanal(int kanal) {
		this.kanal = kanal;
	}

	public String toString() {
		return super.toString() + " /// FSR14 Eingeschaltet: " + isEingeschaltet() + " Kanal: " + getKanal();
	}
}
