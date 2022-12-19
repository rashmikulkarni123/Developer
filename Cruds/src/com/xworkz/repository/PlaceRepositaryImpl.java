package com.xworkz.repository;

import com.xworkz.dto.PlaceDTO;
import com.xworkz.exception.SizeIsFullExceptionInitiated;

public class PlaceRepositaryImpl implements PlaceRepositary {

		PlaceDTO[] dtos = new PlaceDTO[10];
		int index = 0;
		
		
		
		public boolean saved1(PlaceDTO dto) throws SizeIsFullExceptionInitiated {
			
			if(this.index>=this.dtos.length)
			{
				throw new  SizeIsFullExceptionInitiated("Data is full check the array size");
			}
			
			dtos[index] = dto;
			index++;
			
			
			return false;
		}



		@Override
		public boolean saved(PlaceDTO dto) throws SizeIsFullExceptionInitiated {
			// TODO Auto-generated method stub
			return false;
		}

}
