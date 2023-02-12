package com.xworkz.bakery.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.xworkz.bakery.dto.BakeryDto;
import com.xworkz.bakery.repository.BakeryRepository;

@Service
public class BakeryServiceImp implements BakeryService
{

	@Autowired
	private BakeryRepository repo;
	
	public BakeryServiceImp(BakeryRepository repo) {
		this.repo=repo;
	}
	
	@Override
	public boolean validateAndSave(BakeryDto dto) {
		boolean saved=this.repo.save(dto);
		return false;
	}
     

	
}
