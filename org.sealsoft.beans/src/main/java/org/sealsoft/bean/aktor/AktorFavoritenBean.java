package org.sealsoft.bean.aktor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AktorFavoritenBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2359661861029348994L;
	private int id;
	private String beschreibung;
	private List<AktorBean> aktoren = new ArrayList<AktorBean>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	public List<AktorBean> getAktoren() {
		return aktoren;
	}

	public void setAktoren(List<AktorBean> aktoren) {
		this.aktoren = aktoren;
	}

}
