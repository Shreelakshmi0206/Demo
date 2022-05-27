package com.demo.Springbootapp;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.usa;


public interface  USARepository extends PagingAndSortingRepository<usa,Long >  {

	Page<usa> findAll(Pageable paging);

}
