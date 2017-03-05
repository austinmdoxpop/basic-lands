package com.basiclands.servlet;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.basiclands.jackson.Set;
import com.basiclands.jackson.User;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


public class SetServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		String outputString = "<html><body><table>";
		ObjectMapper mapper = new ObjectMapper();
		JsonNode root = mapper.readValue(new File("/SetList.json"), JsonNode.class);
		for (JsonNode set : root) {
			Set s = mapper.readValue(set.toString(), Set.class);
			outputString += "<tr><td>" + s.getName() + "</td><td>" + s.getCode() + "</td><td>" + s.getReleaseDate() + "</td></tr>";
		}
		outputString += "</table></body></html>";
		resp.getOutputStream().write(outputString.getBytes());
	}

}
