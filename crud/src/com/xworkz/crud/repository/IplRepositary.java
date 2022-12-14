package com.xworkz.crud.repository;

import com.xworkz.crud.dto.IplDto;
import com.xworkz.crud.exception.ArraySizeIsFullCantAddMore;

public interface IplRepositary {

		
		boolean create(IplDto dto) throws ArraySizeIsFullCantAddMore;
		
		default int total()	
		{		
			return 0;
		}

		
		default IplDto tempsetName (String tempName)
		{
			return null;
			
		}
		
		
		
		
	}

