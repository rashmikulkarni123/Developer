package com.xworkz.servic;

import com.xworkz.dto.TheaterDTO;
import com.xworkz.exception.CheckTheDataOnceAgainItsNotMatchingRequriements;
import com.xworkz.exception.SizeIsFullExceptionInitiated;

public interface TheaterService {

		boolean validateAndSaved(TheaterDTO dto) throws CheckTheDataOnceAgainItsNotMatchingRequriements, SizeIsFullExceptionInitiated;
		
		
	
}
