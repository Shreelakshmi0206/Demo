package com.demo.Springbootapp;



import java.util.List ;
import org.springframework.ui.Model;  


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	return demoService.getAllCountry();
	}
	
	@GetMapping("/get/world")
	public List<world> getAllWorld(){
	return demoService.getAllWorld();
	}

	
	@RequestMapping(value="/viewcon/{pageid}")    
    public String edit (@PathVariable int pageid,Model m){    
        int total=5;    
        if(pageid==1){}    
        else{    
            pageid=(pageid-1)*total+1;    
        }    
        System.out.println(pageid);  
        List<usa> list=demoService.getUsaByPage(pageid,total);    
         
        return "usa";    
    }    
	
	
}
