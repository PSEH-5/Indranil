package com.example.pojo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class CountryList {

	private List<Country> myCountryList;
	ArrayList<Country> country;
	 
    public CountryList() {
    	country = new ArrayList<Country>();
    }

	public List<Country> getMyCountryList() {
		return myCountryList;
	}

	public void setMyCountryList(List<Country> myCountryList) {
		this.myCountryList = myCountryList;
	}

	public ArrayList<Country> getCountry() {
		return country;
	}

	public void setCountry(ArrayList<Country> country) {
		this.country = country;
	}
 
	
	
}
