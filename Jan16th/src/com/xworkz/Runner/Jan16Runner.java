package com.xworkz.Runner;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.Thing.PetrolBunk;
import com.xworkz.jan16onfiguration.SpringConfiguration;
import com.xworkz.jan16task.Browser;

public class Jan16Runner {
public static void main (String [] args) {
	ApplicationContext alexa = new AnnotationConfigApplicationContext(SpringConfiguration.class);
	System.out.println(Arrays.toString(alexa.getBeanDefinitionNames()));
	
	System.err.println("data of Petrol Bunk");
	PetrolBunk ref = alexa.getBean(PetrolBunk.class);
        ref.purchase();	
		
        System.err.println("data of Browser");
    	Browser ref1 = alexa.getBean(Browser.class);
            ref.purchase();	

}
}
