package org.sealsoft.bean.aktor;

public class FUD14Bean extends AktorBean {
	private static final long serialVersionUID = 4698578316708781029L;
	private Boolean eingeschaltet = null;
	private Integer dimmwert = null;
	private Integer dimmwertStandard = null;
	private Integer dimmgeschwindigkeit = null;
	private Integer dimmgeschwindigkeitStandard = null;

	public Boolean getEingeschaltet() {
		return eingeschaltet;
	}

	public void setEingeschaltet(Boolean eingeschaltet) {
		this.eingeschaltet = eingeschaltet;
	}

	public Integer getDimmwert() {
		return dimmwert;
	}

	public void setDimmwert(Integer dimmwert) {
		this.dimmwert = dimmwert;
	}

	public Integer getDimmwertStandard() {
		return dimmwertStandard;
	}

	public void setDimmwertStandard(Integer dimmwertStandard) {
		this.dimmwertStandard = dimmwertStandard;
	}

	public Integer getDimmgeschwindigkeit() {
		return dimmgeschwindigkeit;
	}

	public void setDimmgeschwindigkeit(Integer dimmgeschwindigkeit) {
		this.dimmgeschwindigkeit = dimmgeschwindigkeit;
	}

	public Integer getDimmgeschwindigkeitStandard() {
		return dimmgeschwindigkeitStandard;
	}

	public void setDimmgeschwindigkeitStandard(Integer dimmgeschwindigkeitStandard) {
		this.dimmgeschwindigkeitStandard = dimmgeschwindigkeitStandard;
	}

	public String toString() {
		return super.toString() + " /// FUD14 Eingeschaltet: " + getEingeschaltet() + " Dimmwert: " + getDimmwert()
				+ " Dimmgeschwindikeit: " + getDimmgeschwindigkeit();
	}

}
