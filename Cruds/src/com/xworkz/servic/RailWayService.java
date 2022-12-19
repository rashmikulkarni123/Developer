package com.xworkz.servic;

import com.xworkz.dto.RailWayStationDTO;
import com.xworkz.exception.CheckTheDataOnceAgainItsNotMatchingRequriements;
import com.xworkz.exception.SizeIsFullExceptionInitiated;

public interface RailWayService {
	boolean validateAndSaved(RailWayStationDTO dto) throws SizeIsFullExceptionInitiated, CheckTheDataOnceAgainItsNotMatchingRequriements 
		
	}


