package com.xworkz.repository;

import com.xworkz.dto.TheaterDTO;
import com.xworkz.exception.SizeIsFullExceptionInitiated;

public interface TheaterRepositary {

		
		boolean saving(TheaterDTO<?> dto) throws SizeIsFullExceptionInitiated;
}
