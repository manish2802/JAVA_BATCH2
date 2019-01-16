package com.newzen.dao;

public class LoginDAOImpl implements LoginDAO {

	public static LoginDAO INSTANCE;

	private LoginDAOImpl() {
	}

	public static synchronized LoginDAO getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new LoginDAOImpl();
			return INSTANCE;
		}
		return INSTANCE;
	}

	@Override
	public boolean login(String userName, String password) {
		// TODO Auto-generated method stub
		return false;
	}

}
