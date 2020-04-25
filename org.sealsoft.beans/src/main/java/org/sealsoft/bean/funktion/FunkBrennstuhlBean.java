package org.sealsoft.bean.funktion;

import org.sealsoft.bean.aktor.BrennstuhlBean;

public class FunkBrennstuhlBean extends FunktionBean {
	BrennstuhlBean bean;

	public FunkBrennstuhlBean(BrennstuhlBean bean, boolean einschalten) {
		this.bean = bean;
		setBeschreibung(bean.getBeschreibung());
		setEinschalten(einschalten);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 6809053594615300008L;
	private boolean einschalten = false;

	public boolean isEinschalten() {
		return einschalten;
	}

	public void setEinschalten(boolean einschalten) {
		this.einschalten = einschalten;
	}

	public BrennstuhlBean getBean() {
		return bean;
	}

	public void setBean(BrennstuhlBean bean) {
		this.bean = bean;
	}

}
