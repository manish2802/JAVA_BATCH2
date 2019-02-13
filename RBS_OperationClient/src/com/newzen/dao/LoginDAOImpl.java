package com.newzen.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.newzen.util.DBUtil;
import com.newzen.util.QueryConstant;

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
		Connection con = DBUtil.getConnection();
		try {
			PreparedStatement pstm = con.prepareStatement(QueryConstant.Employee.EMPLOYEE_LOGIN);
			pstm.setString(1, userName);
			pstm.setString(2, password);
			ResultSet rs = pstm.executeQuery();
			rs.next();			
			String s = rs.getString(1);
			if ("1".equalsIgnoreCase(s)) {
				return true;
			}
			return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		return false;
	}

}
