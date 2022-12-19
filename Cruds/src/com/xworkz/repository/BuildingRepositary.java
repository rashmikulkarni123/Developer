package com.xworkz.repository;

import com.xworkz.dto.BuildingDTO;
import com.xworkz.exception.SizeIsFullExceptionInitiated;

public class BuildingRepositary {

		
		boolean saving(BuildingDTO<?> dto) throws SizeIsFullExceptionInitiated {
			return false;
		}
		
}
