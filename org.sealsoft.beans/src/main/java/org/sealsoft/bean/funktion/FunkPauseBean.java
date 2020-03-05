package org.sealsoft.bean.funktion;

public class FunkPauseBean extends FunktionBean {
	private static final long serialVersionUID = -6448748437550580244L;
	private int sekunden = 0;

	public FunkPauseBean() {
	}

	public FunkPauseBean(String beschreibung, int sekunden) {
		setBeschreibung(beschreibung);
		this.sekunden = sekunden;
	}

	public int getSekunden() {
		return sekunden;
	}

	public void setSekunden(int sekunden) {
		this.sekunden = sekunden;
	}

}
