package org.sealsoft.bean.system;

import java.io.Serializable;

public class FireBaseTokenBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3712073404812709648L;
	private String token = "";

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
