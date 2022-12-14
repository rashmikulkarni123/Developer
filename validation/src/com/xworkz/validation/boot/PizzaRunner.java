package com.xworkz.validation.boot;

import java.time.LocalDateTime;

import com.xworkz.validation.constant.PizzaSize;
import com.xworkz.validation.dto.PizzaDTO;
import com.xworkz.validation.service.Pizza;
import com.xworkz.validation.service.PizzaService;


public class PizzaRunner {

	private static final PizzaSize Large = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	PizzaDTO pizzaDto = new PizzaDTO();	
	Pizza pizza = new PizzaService();
	
	pizzaDto.setPrice(3000);
	pizzaDto.setType("Veg");
	pizzaDto.setFlavour("Cheese Flavour");
	pizzaDto.setCheese(false);
	pizzaDto.setSize(Large);
	pizzaDto.setCompany("Pizza Hut");
	pizzaDto.setName("Mexican Cheese Pizza");
    pizzaDto.setCreatedby("aaaa");
    pizzaDto.setCreatedDateTime(LocalDateTime.now());
    pizzaDto.setUpdatedBy("Aaaa");
    pizzaDto.setUpdatedDateTime(LocalDateTime.now());
		
    pizza.pizzaCreate(pizzaDto);
		
		
		
		
	}

}
