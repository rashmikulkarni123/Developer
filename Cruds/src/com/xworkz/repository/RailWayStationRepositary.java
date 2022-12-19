package com.xworkz.repository;

import com.xworkz.dto.RailWayStationDTO;
import com.xworkz.exception.CheckTheDataOnceAgainItsNotMatchingRequriements;
import com.xworkz.exception.SizeIsFullExceptionInitiated;

public class RailWayStationRepositary implements RailWayRepositary {

		RailWayStationDTO[] dtos = new RailWayStationDTO[5];
		int index = 0;
		
		
		public boolean saved1(RailWayStationDTO dto) throws SizeIsFullExceptionInitiated {
			
			if(this.index>=this.dtos.length)
			{
				throw new SizeIsFullExceptionInitiated("Check the data array size is full");
			}
			
			dtos[index]=dto;
			index++;
			return false;
		}


		@Override
		public boolean saved(RailWayStationDTO dto)
				throws SizeIsFullExceptionInitiated, CheckTheDataOnceAgainItsNotMatchingRequriements {
			// TODO Auto-generated method stub
			return false;
		}
}
