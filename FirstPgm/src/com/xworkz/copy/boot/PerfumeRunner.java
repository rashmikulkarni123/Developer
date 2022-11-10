package com.xworkz.copy.boot;

import com.xworkz.copy.Thing.Perfume;
import com.xworkz.copy.Thing.PerfumeModify;

public class PerfumeRunner {
public static void main(String[] args) {
		
		Perfume perfume= new Perfume();
		PerfumeModify modify=new PerfumeModify();
		
		System.out.println(perfume.getBrand());
        modify.usePerfume(perfume);
	}

}

