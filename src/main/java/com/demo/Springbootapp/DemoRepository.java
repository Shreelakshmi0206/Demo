package com.demo.Springbootapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import java.sql.ResultSet;    
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper; 

import com.demo.entity.country;
import com.demo.entity.usa;
import com.demo.entity.world;

public class DemoRepository {
	
	JdbcTemplate template;    
    
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}    

	public List <country> country = new ArrayList <country>();
	public List <world> world = new ArrayList <world>();
	public List<country> getAllCountry() {
		// TODO Auto-generated method stub
		return  country;
	}
	public List<world> getAllWorld() {
		// TODO Auto-generated method stub
		return world;
	}
	
	public List<usa> getUsaByPage(int pageid, int  total) {
		String sql="select * from emp limit "+(pageid-1)+","+total;    
	    return template.query(sql,new RowMapper<usa>(){    
	        public usa mapRow(ResultSet rs, int row) throws SQLException { 
	        	usa us  = new usa();
	        	us.setStateId(rs.getInt(1));
	        	return us;
	        }
	    }); 
		
		
		
	}
	    

}
