package com.basiclands.servlet;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.basiclands.jackson.BasicLandNames;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class GetLandsFromJsonServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String outputString = "[";
		ObjectMapper mapper = new ObjectMapper();
		JsonNode root = mapper.readValue(new File("/AllSetsArray.json"), JsonNode.class);
		for (JsonNode set : root) {
			for (JsonNode card : set.get("cards")) {
				for (String landName : BasicLandNames.getNames()) {
					if (card.get("name").asText().equals(landName)) {
						((ObjectNode)card).put("set", set.get("code").asText());
						outputString += card.toString() + ",";
						break;
					}
				}
			}
		}
		outputString += "]";
		resp.getOutputStream().write(outputString.getBytes());
		
	}


}
