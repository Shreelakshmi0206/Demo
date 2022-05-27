package com.demo.Springbootapp;

import java.util.List;

import com.demo.entity.usa;

public interface IUSAService {
	
	List<usa> findPaginated(int pageNo, int pageSize);
	}


