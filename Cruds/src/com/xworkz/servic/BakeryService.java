package com.xworkz.servic;

import com.xworkz.dto.BakeryDTO;
import com.xworkz.exception.CheckTheDataOnceAgainItsNotMatchingRequriements;
import com.xworkz.exception.SizeIsFullExceptionInitiated;

public interface BakeryService {
	boolean validateAndSave(BakeryDTO dto) throws CheckTheDataOnceAgainItsNotMatchingRequriements, SizeIsFullExceptionInitiated;
}
