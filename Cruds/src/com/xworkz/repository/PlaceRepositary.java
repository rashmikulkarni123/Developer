package com.xworkz.repository;

import com.xworkz.dto.PlaceDTO;
import com.xworkz.exception.SizeIsFullExceptionInitiated;

public interface PlaceRepositary {

	
	boolean saved(PlaceDTO dto) throws SizeIsFullExceptionInitiated;
}

