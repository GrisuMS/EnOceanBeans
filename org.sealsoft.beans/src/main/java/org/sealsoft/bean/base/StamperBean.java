package org.sealsoft.bean.base;

import java.io.Serializable;
import java.util.GregorianCalendar;

public class StamperBean implements Serializable {
	private static final long serialVersionUID = 1365580593711206061L;

	public void stamp(BaseEntityBean entity) {
		entity.setUserName(UsersBean.instance.get());
		entity.setLastUpdate(new GregorianCalendar());
	}

}
