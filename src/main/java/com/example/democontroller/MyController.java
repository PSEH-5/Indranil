package com.example.democontroller;



import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.client.utils.URIBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.pojo.Country;
import com.example.pojo.CountryList;
import com.example.pojo.LeaguList;
import com.example.pojo.League;
import com.example.pojo.PlayerPojo;;

@RestController
public class MyController {
	 String APIKey="9bb66184e0c8145384fd2cc0f7b914ada57b4e8fd2e4d6d586adcc27c257a978";
	 String GetCountryURI="https://apiv2.apifootball.com/?";

	
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	QueryString qs;
	@Autowired
	PlayerPojo playerPojo;
	
	@Autowired
	LeaguList leagueList;
	
	@GetMapping("/country")
	public ResponseEntity<CountryList> getCountry()
	{		
	 		
		 QueryString qs = new QueryString("pg", "q");
		    qs = new QueryString("action", "get_countries");
		//    qs.add("country_id", "country_id");
		    qs.add("APIKey", APIKey);
			    
			    String url =  GetCountryURI + qs;

		CountryList response = restTemplate.getForObject(url,CountryList.class);	
			
		//	CountryList mylist = response.getMyCountryList();
			return ResponseEntity.ok().body(response);
	}
		  
	@GetMapping("/teams")
	public ResponseEntity<PlayerPojo> getTeams()
	{		
		 QueryString qs = new QueryString("pg", "q");
		    qs = new QueryString("action", "get_teams");
			
			    qs.add("APIKey", APIKey);
			    String url =  GetCountryURI + qs;

			    playerPojo = restTemplate.getForObject(url,PlayerPojo.class);	
			
			
			return ResponseEntity.ok().body(playerPojo);
	}
		  

	@GetMapping("/leagues")
	public ResponseEntity<LeaguList> getleagues()
	{		
		QueryString qs = new QueryString("pg", "q");
	    qs = new QueryString("action", "get_leagues");
	    qs.add("country_id", "41");
	    qs.add("APIKey", APIKey);
	    
			    String url =  GetCountryURI + qs;

			    leagueList= restTemplate.getForObject(url,LeaguList.class);	
			
			
			return ResponseEntity.ok().body(leagueList);
	}
		  
	
	
	
	
	
	}
	







