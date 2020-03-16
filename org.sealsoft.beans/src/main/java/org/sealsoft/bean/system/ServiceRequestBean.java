package org.sealsoft.bean.system;

import java.io.Serializable;

public class ServiceRequestBean implements Serializable {
	public static String GET_SYSTEM_BEAN = "GET_SYSTEM_BEAN";
	/**
	 * 
	 */
	private static final long serialVersionUID = 4867602059317937888L;
	private String requestedService;

	public String getRequestedService() {
		return requestedService;
	}

	public void setRequestedService(String requestedService) {
		this.requestedService = requestedService;
	}

}
