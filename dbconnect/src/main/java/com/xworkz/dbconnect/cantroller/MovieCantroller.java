package com.xworkz.dbconnect.cantroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.dbconnect.dto.MovieDto;
import com.xworkz.dbconnect.service.MovieServiceImpl;



@Component
@RequestMapping("/show")
public class MovieCantroller {
	@Autowired
	private MovieServiceImpl service;
	@PostMapping
	public String onBakery(MovieDto dto,Model model) {
		model.addAttribute("mdto", dto);
		System.out.println(dto);
		System.out.println("Running cantroller");

	boolean saved=	service.validateAndSave(dto);
	System.out.println(saved);
		return "picture";
	}

}
