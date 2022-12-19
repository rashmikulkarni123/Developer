package com.xworkz.boot;

import java.time.LocalDateTime;

import com.source.repositary.TheaterRepositaryImpl;
import com.xworkz.constant.Brand;
import com.xworkz.dto.TheaterDTO;
import com.xworkz.exception.CheckTheDataOnceAgainItsNotMatchingRequriements;
import com.xworkz.exception.SizeIsFullExceptionInitiated;
import com.xworkz.repository.TheaterRepositary;
import com.xworkz.servic.TheaterService;
import com.xworkz.servic.TheaterServiceImpl;

public class TheaterRunner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TheaterDTO dto = new TheaterDTO(356,"Shakti Theater",Brand.IMAX,5700);
		dto.setCreatedby("Rash");
		dto.setCreatedDateTime(LocalDateTime.now());
		dto.setUpdatedBy("Rash");
		dto.setUpdatedDateTime(LocalDateTime.now());
		
		TheaterRepositary repositary = new TheaterRepositaryImpl();
		
		TheaterService service = new TheaterServiceImpl(repositary);
		
		
		
		boolean saved;
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
