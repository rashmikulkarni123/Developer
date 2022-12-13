package com.xworkz.repository;

import com.source.customexception.ArraySizeIsFullCantAddMore;
import com.source.dto.IplDto;

public interface IplRepositary<IplDto> {

	
	
	boolean create(IplDto dto);
	
	default int total()	
	{		
		return 0;
	}
	
}
