package com.kripa.food;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FoodCartDbUtil {

	public static List<Food> getFoodList() throws ClassNotFoundException, SQLException
	{
		
		String url = "jdbc:mysql://localhost:3306/food";
		String username = "root";
		String password = "Kripanand";
		
		ArrayList<Food> food = new ArrayList();
		
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con = DriverManager.getConnection(url, username ,password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from foodcart");
		while(rs.next())
		{
			int id = rs.getInt(1);
			String item = rs.getString(2);
			int price = rs.getInt(3);
			
			Food f = new Food(id ,item ,price);
			food.add(f);
		}
		
		return food;
	}
}
