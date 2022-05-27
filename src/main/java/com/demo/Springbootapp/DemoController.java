package com.demo.Springbootapp;



import java.util.List ;

import org.springframework.ui.Model;  


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.demo.entity.country;
import com.demo.entity.usa;
import com.demo.entity.world;

@RestController 
@RequestMapping ("/con")

public class DemoController {
	
	
	
	@Autowired 
	Demoservice demoService;

	@GetMapping("/get/country")
	public List<country> getAllCountry(){
		String url ="https://rapidapi.com/KishCom/api/covid-19-coronavirus-statistics/";
		RestTemplate restTemplate =new RestTemplate(); 
		Object  country=restTemplate .getForObject(url, Object[].class);
	return demoService.getAllCountry();
	}
	
	@GetMapping("/get/world")
	public List<world> getAllWorld(){
		String url ="https://rapidapi.com/KishCom/api/covid-19-coronavirus-statistics/";
		RestTemplate restTemplate =new RestTemplate(); 
		Object  world=restTemplate .getForObject(url, Object[].class);
	return demoService.getAllWorld();
	}

	
	
	
	
}
