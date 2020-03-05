package org.sealsoft.bean.szene;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.sealsoft.bean.funktion.FunktionBean;

public class SzeneBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1640921827151931218L;
	private int idSzene;
	private String kurzbezeichnung = "";
	private String beschreibung = "";

	List<FunktionBean> objekte = new ArrayList<FunktionBean>();
	Set<FunktionBean> ausloeser = new HashSet<FunktionBean>();

	public int getIdSzene() {
		return idSzene;
	}

	public void setIdSzene(int idSzene) {
		this.idSzene = idSzene;
	}

	public String getKurzbezeichnung() {
		return kurzbezeichnung;
	}

	public void setKurzbezeichnung(String kurzbezeichnung) {
		this.kurzbezeichnung = kurzbezeichnung;
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	public List<FunktionBean> getObjekte() {
		return objekte;
	}

	public void setObjekte(List<FunktionBean> objekte) {
		this.objekte = objekte;
	}

	public void addObject(FunktionBean funktion) {
		this.objekte.add(funktion);
	}

	public Set<FunktionBean> getAusloeser() {
		return ausloeser;
	}

	public void setAusloeser(Set<FunktionBean> ausloeser) {
		this.ausloeser = ausloeser;
	}

	public void addAusloeser(FunktionBean funktion) {
		this.ausloeser.add(funktion);
	}
}
