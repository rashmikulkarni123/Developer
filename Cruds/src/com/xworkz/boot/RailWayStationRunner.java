package com.xworkz.boot;

import java.time.LocalDateTime;

import com.xworkz.dto.RailWayStationDTO;
import com.xworkz.exception.CheckTheDataOnceAgainItsNotMatchingRequriements;
import com.xworkz.exception.SizeIsFullExceptionInitiated;
import com.xworkz.repository.RailWayRepositary;
import com.xworkz.repository.RailWayStationRepositary;
import com.xworkz.servic.RailWayService;
import com.xworkz.servic.RailWayStationServiceImpl;

public class RailWayStationRunner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RailWayStationDTO dto = new RailWayStationDTO();
		RailWayRepositary repositary = new RailWayStationRepositary();
		RailWayService service = new RailWayStationServiceImpl(repositary);
		    dto.setCreatedby("Rash");
			dto.setCreatedDateTime(LocalDateTime.now());
			dto.setUpdatedBy("Rash");
			dto.setUpdatedDateTime(LocalDateTime.now());
			
		try {
			service.validateAndSaved(dto);
		} catch (SizeIsFullExceptionInitiated e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CheckTheDataOnceAgainItsNotMatchingRequriements e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
