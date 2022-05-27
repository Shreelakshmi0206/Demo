package com.demo.Springbootapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.demo.entity.usa;

public class USAService implements  IUSAService {
	@Autowired
    private USARepository usarepository;

    @Override
    public List<usa> findPaginated(int pageNo, int pageSize) {

        PageRequest paging = PageRequest.of(pageNo, pageSize);
        Page<usa> pagedResult = usarepository.findAll(paging);

        return pagedResult.toList();
    }

}
