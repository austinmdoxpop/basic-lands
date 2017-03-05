package com.basiclands.jackson;

public class Set {
	private String _name, _code, _releaseDate;
	
	//Name getters and setters
	public void setName(String n) { _name = n; }
	public String getName() { return _name; }
	
	//Code getters and setters
	public void setCode(String c) {_code = c; }
	public String getCode() { return _code; }
	
	//Release Date getters and setters
	public void setReleaseDate(String d) { _releaseDate = d; }
	public String getReleaseDate() { return _releaseDate; }
	
	//Return this class as a string
	public String toString() {
		return "Name: " + _name + " Code: " + _code + " Release Date: " + _releaseDate;
	}
}
