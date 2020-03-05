package org.sealsoft.bean.base;

import java.io.Serializable;

public class UsersBean extends ThreadLocal<String> implements Serializable {
	private static final long serialVersionUID = 1395590031746844832L;
	public static final UsersBean instance = new UsersBean();

	private UsersBean() {
	}
}
