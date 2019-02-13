/*FileName:QueryConstant.java
 * 
 */
package com.newzen.util;

public class QueryConstant {

	public static class Employee {
		public static String EMPLOYEE_LOGIN = new StringBuilder("SELECT COUNT(*) CONT FROM EMPLOYEE_LOGIN")
				.append(" WHERE USER_NAME=? AND USER_PASSWORD=?").toString();
	}

	public static class Customer {
		public static String CUSTOMER_LOGIN = new StringBuilder(
				"SELECT COUNT(*) FROM EMPLOYEE WHERE USER_ID=? AND PASSWORD=?;").toString();
	}

}
