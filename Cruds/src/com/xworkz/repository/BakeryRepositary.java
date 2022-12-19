package com.xworkz.repository;

import com.xworkz.dto.BakeryDTO;
import com.xworkz.exception.SizeIsFullExceptionInitiated;
public interface BakeryRepositary {

	
	boolean saving(BakeryDTO dto) throws SizeIsFullExceptionInitiated;

}
