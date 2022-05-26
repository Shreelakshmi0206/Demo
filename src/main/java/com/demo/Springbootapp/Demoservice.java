package com.demo.Springbootapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.entity.country;
import com.demo.entity.usa;
import com.demo.entity.world;

public class Demoservice {
@Autowired
DemoRepository demoRepository;

	public List<country> getAllCountry() {
		// TODO Auto-generated method stub
		return  demoRepository.getAllCountry();
	}

	public List<world> getAllWorld() {
		// TODO Auto-generated method stub
		return demoRepository.getAllWorld();
	}

	

	public List<usa> getUsaByPage(int pageid, int total) {
		// TODO Auto-generated method stub
		return demoRepository.getUsaByPage(pageid, total);
	}

}
