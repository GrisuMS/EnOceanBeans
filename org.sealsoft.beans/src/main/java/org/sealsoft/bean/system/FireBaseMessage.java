package org.sealsoft.bean.system;

import java.io.Serializable;

public class FireBaseMessage implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 105166198178996518L;
	private int id;
	private int nr;
	private int nrmax;
	private String message;

	public FireBaseMessage() {
	}

	public FireBaseMessage(int id, int nr, int max, String msg) {
		this.id = id;
		this.nr = nr;
		this.nrmax = max;
		this.message = msg;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNr() {
		return nr;
	}

	public void setNr(int nr) {
		this.nr = nr;
	}

	public int getNrmax() {
		return nrmax;
	}

	public void setNrmax(int nrmax) {
		this.nrmax = nrmax;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
