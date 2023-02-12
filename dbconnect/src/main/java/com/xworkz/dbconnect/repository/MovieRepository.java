package com.xworkz.dbconnect.repository;

import com.xworkz.dbconnect.dto.MovieDto;

public interface MovieRepository {
	
	 boolean save(MovieDto dto);
	 
}
