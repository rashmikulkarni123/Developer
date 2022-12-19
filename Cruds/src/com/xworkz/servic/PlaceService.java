package com.xworkz.servic;

import com.xworkz.dto.PlaceDTO;
import com.xworkz.exception.CheckTheDataOnceAgainItsNotMatchingRequriements;
import com.xworkz.exception.SizeIsFullExceptionInitiated;

public interface PlaceService {
	 default boolean validateAndSaved(PlaceDTO dto) throws CheckTheDataOnceAgainItsNotMatchingRequriements, SizeIsFullExceptionInitiated {
		return false;
	}
}
