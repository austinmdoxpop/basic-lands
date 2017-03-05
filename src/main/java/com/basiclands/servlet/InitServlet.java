package com.basiclands.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.basiclands.jackson.Set;
import com.basiclands.jackson.User;
import com.fasterxml.jackson.databind.ObjectMapper;


public class InitServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		String jsonString = "{\"name\" : { \"first\" : \"Joe\", \"last\" : \"Sixpack\" }, \"gender\" : \"MALE\", \"verified\" : false, \"userImage\" : \"Rm9vYmFyIQ==\"}";
		String setString = "{\"name\":\"Limited Edition Alpha\",\"code\":\"LEA\",\"releaseDate\":\"1993-08-05\"}";
		String outputString = "";
		ObjectMapper mapper = new ObjectMapper();
		User user = mapper.readValue(jsonString, User.class);
		outputString += user.getNameAsString() + " ";
		Set set = mapper.readValue(setString, Set.class);
		outputString += set.toString();
		resp.getOutputStream().write(outputString.getBytes());
	}

}
