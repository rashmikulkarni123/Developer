package com.xworkz.repository;

import com.source.dto.IplDto;
import com.xworkz.exception.ArraySizeIsFullCantAddMore;

public class IplRepositaryimpl implements IplRepositary {

	private IplDto[] iplDto = new IplDto[10];
	private int index = 0;
	
	
	@Override
	public boolean create(IplDto dto)  {
		System.out.println("Running the  create IplDto"+ dto);
		if(this.index>=this.iplDto.length)
		{
			System.out.println("Running the Custom Exception");
			throw new ArraySizeIsFullCantAddMore();
		}
		
		this.iplDto[this.index]=dto;
		System.out.println("Saved:"+dto+"In index"+this.index);
		index++;
		
		// TODO Auto-generated method stub
		return false;
		
	}


	public boolean create1(IplDto dto) {
		// TODO Auto-generated method stub
		return false;
	}

}
