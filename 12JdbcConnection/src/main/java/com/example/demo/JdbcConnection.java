package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Value;

public class JdbcConnection {

	@Value("${mysql.url}")
	private String Url;

	@Value("${mysql.username}")
	private String userName;

	@Value("${mysql.password}")
	private String password;

	@Value("${mysql.driver}")
	private String driver;

	public void displayInfo() {
		System.out.println("Url is :- " + Url + " " + "Password is :- " + password + " " + "Username is :- " + userName
				+ " " + "Driver is :-" + driver);
	}

	public void getJdbcConnection() throws Exception 
	{
		Class.forName(driver);
		Connection con = DriverManager.getConnection(Url, userName, password);
		System.out.println("Jdbc connect successfully" + " " +con);
	}

}
