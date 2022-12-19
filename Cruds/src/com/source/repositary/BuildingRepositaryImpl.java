package com.source.repositary;

import com.xworkz.dto.BakeryDTO;
import com.xworkz.dto.BuildingDTO;
import com.xworkz.exception.SizeIsFullExceptionInitiated;
import com.xworkz.repository.BakeryRepositary;

public class BuildingRepositaryImpl implements BakeryRepositary {

	BuildingDTO[] dtos = new BuildingDTO[10];
	int index = 0;
	
	
	
	public boolean saving(BuildingDTO dto) throws SizeIsFullExceptionInitiated {
	  
		if(this.index>=this.dtos.length)
		{
			throw new SizeIsFullExceptionInitiated("Check the data is full and array is full");
			
		}
		
		dtos[index]=dto;
		index++;
		
		
		return false;
	}



	@Override
	public boolean saving(BakeryDTO dto) throws SizeIsFullExceptionInitiated {
		// TODO Auto-generated method stub
		return false;
	}
}