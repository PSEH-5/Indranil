package com.example.pojo;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.example.democontroller.QueryString;
public class MainClass {
	

	public static void main(String[] args) {
		String APIKey="9bb66184e0c8145384fd2cc0f7b914ada57b4e8fd2e4d6d586adcc27c257a978";
		String GetCountryURI="https://apiv2.apifootball.com/?";
		
		 QueryString qs = new QueryString("pg", "q");
		    qs = new QueryString("action", "get_countries");
		//    qs.add("country_id", "country_id");
		    qs.add("APIKey", APIKey);
	    
			   
		
		    String url =  GetCountryURI + qs;

	    System.out.println(url);
	  }
	
	
}
