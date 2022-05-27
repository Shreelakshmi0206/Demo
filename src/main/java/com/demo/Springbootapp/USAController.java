package com.demo.Springbootapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.demo.entity.usa;

public class USAController {
	
	 @Autowired
	    private USAService usaservice;

	@GetMapping("/countries/{pageNo}/{pageSize}")
    public List<usa> getPaginatedCountries(@PathVariable int pageNo, @PathVariable int pageSize) {

        return usaservice.findPaginated(pageNo, pageSize);
    }

}
