package com.xworkz.repository;

import com.xworkz.dto.RailWayStationDTO;
import com.xworkz.exception.CheckTheDataOnceAgainItsNotMatchingRequriements;
import com.xworkz.exception.SizeIsFullExceptionInitiated;

public interface RailWayRepositary {
	boolean saved(RailWayStationDTO dto) throws SizeIsFullExceptionInitiated, CheckTheDataOnceAgainItsNotMatchingRequriements;
}
