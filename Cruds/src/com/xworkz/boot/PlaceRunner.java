package com.xworkz.boot;

import java.time.LocalDateTime;

import com.xworkz.dto.PlaceDTO;
import com.xworkz.exception.CheckTheDataOnceAgainItsNotMatchingRequriements;
import com.xworkz.exception.SizeIsFullExceptionInitiated;
import com.xworkz.repository.PlaceRepositary;
import com.xworkz.repository.PlaceRepositaryImpl;
import com.xworkz.servic.PlaceService;
import com.xworkz.servic.PlaceServiceImpl;

public class PlaceRunner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PlaceDTO dto = new PlaceDTO();
		PlaceRepositary repositary = new PlaceRepositaryImpl();
		
		PlaceService service = new PlaceServiceImpl(repositary);
		    dto.setCreatedby("Rash");
			dto.setCreatedDateTime(LocalDateTime.now());
			dto.setUpdatedBy("Rash");
			dto.setUpdatedDateTime(LocalDateTime.now());
			
		try {
			service.validateAndSaved(dto);
		} catch (CheckTheDataOnceAgainItsNotMatchingRequriements e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SizeIsFullExceptionInitiated e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
