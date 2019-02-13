package com.newzen.service;

import com.newzen.dao.LoginDAOImpl;

public class LoginBOImpl implements LoginBO {

	public static LoginBOImpl INSTANCE;

	private LoginBOImpl() {
	}

	public static synchronized LoginBO getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new LoginBOImpl();
			return INSTANCE;
		}
		return INSTANCE;
	}

	@Override
	public boolean login(String userName, String password) {
		// TODO Auto-generated method stub
		 boolean b=LoginDAOImpl.getInstance().login(userName, password);
		
		return b;
	}

}