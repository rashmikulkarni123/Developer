package com.xworkz.bakery.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.xworkz.bakery.dto.BakeryDto;
import com.xworkz.bakery.service.BakeryServiceImp;

@Component
@RequestMapping("/")
public class BakeryController {
	
	@Autowired
	private BakeryServiceImp service;
	
	public BakeryController() {
		System.out.println("running BakeryController...........");
	
	}
	
	@GetMapping("/bake")
	public String onBakery(BakeryDto dto,Model model) {
		model.addAttribute("bdto", dto);

	boolean saved=	service.validateAndSave(dto);
	System.out.println(saved);
		return "Success.jsp";
	}
}
