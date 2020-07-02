package com.kripa.food;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class food
 */
@WebServlet("/food")
public class FoodCart extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get the data from database
		
		//redirect to different page (view)
		
//		String[] fooditem= {"briyani" ,"pizza" ,"chicken" ,"lolypop"};
//		request.setAttribute("fooditem", fooditem);
		
		try {
			List<Food> fooditem = FoodCartDbUtil.getFoodList();
			request.setAttribute("fooditem", fooditem);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("show-food.jsp");
		dispatcher.forward(request, response);
	}

}
