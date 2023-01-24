package com.xworkz.Thing;

import org.springframework.stereotype.Component;

@Component
public class Experience {
private Skill skill;
public Skill getSkill() {
	return skill;
}
public Experience() {
	System.out.println("Running experience");
}

}
