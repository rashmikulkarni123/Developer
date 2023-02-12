package com.xworkz.bakery.repository;

import org.springframework.stereotype.Repository;

import com.xworkz.bakery.dto.BakeryDto;

@Repository
public class BakeryRepositoryImp implements BakeryRepository
{

	
	public BakeryRepositoryImp() {
		System.out.println("running BakeryRepositoryImp...................");
	}

	@Override
	public boolean save(BakeryDto dto) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
