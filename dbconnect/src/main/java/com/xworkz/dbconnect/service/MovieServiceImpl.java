package com.xworkz.dbconnect.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.dbconnect.dto.MovieDto;
import com.xworkz.dbconnect.repository.MovieRepository;


@Service
public class MovieServiceImpl implements MovieService{
	public MovieServiceImpl()
	{
		System.out.println("Running impl");
	}
	@Autowired
	private MovieRepository repo;
	
	public MovieServiceImpl(MovieRepository repo) {
		this.repo=repo;
	}
	
	@Override
	public boolean validateAndSave(MovieDto dto) {
		
		System.out.println("runnig in validateAndSave");
		boolean saved=this.repo.save(dto);
		System.out.println(saved); 
		return false;
	}
     
}
