package com.xworkz.dbconnect.service;


import com.xworkz.dbconnect.dto.MovieDto;

public interface MovieService {
	  boolean validateAndSave(MovieDto dto);
	  
}
