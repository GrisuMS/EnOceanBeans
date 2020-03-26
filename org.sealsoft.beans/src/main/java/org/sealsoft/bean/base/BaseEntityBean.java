package org.sealsoft.bean.base;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class BaseEntityBean implements Serializable, Cloneable {
	private static final long serialVersionUID = -75862956123625545L;

	private String userName;

	private Calendar lastUpdate;

	@Override
	public String toString() {
		String str = "";
		if (this.lastUpdate != null) {
			SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

			str = ", " + format1.format(this.lastUpdate.getTime());
		}
		return this.userName + str;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Calendar getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Calendar lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
