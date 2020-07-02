package com.example.demo;

import java.sql.*;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class StudentDB {

	private String driver;
	private String url;
	private String userName;
	private String password;

	Connection con;

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		System.out.println("setter driver");
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		System.out.println("setter url");
		this.url = url;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		System.out.println("setter userName");
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		System.out.println("setter Password");
		this.password = password;
	}

//	@PostConstruct
	public void init() throws ClassNotFoundException, SQLException {
		System.out.println("Inside the custom init method");
		DbConnection();
	}

	public void DbConnection() throws ClassNotFoundException, SQLException {
		System.out.println("Creating Connection");
		Class.forName(driver);
		con = DriverManager.getConnection(url, userName, password);
	}

	public void selectRows() throws ClassNotFoundException, SQLException {
		System.out.println("Retrive all the data from StudentDb");

		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from hostalstudent");

		while (rs.next()) {
			int studentid = rs.getInt(1);
			String StudentName = rs.getString(2);
			int hostalFees = rs.getInt(3);
			String foodType = rs.getString(4);

			System.out.println(studentid + " " + StudentName + " " + hostalFees + foodType);
		}
	}

	public void DeleteRows(int stuid) throws SQLException, ClassNotFoundException {

		Statement stmt = con.createStatement();
		stmt.executeUpdate("delete from hostalstudent where Student_id = " + stuid);

		System.out.println("Record delete with the student id" + stuid);
	}

	public void Connectionclose() throws SQLException {
		con.close();
	}
	
//	@PreDestroy
	public void destroy() throws SQLException {
		// clean up job
		System.out.println("inside destory method");
		Connectionclose();
	}
}
