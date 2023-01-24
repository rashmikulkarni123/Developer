package com.xworkz.Thing;

import org.springframework.stereotype.Component;

@Component
public class Producer {
private Assistant assistant;
public Assistant getAssistant() {
	return assistant;
}
}
