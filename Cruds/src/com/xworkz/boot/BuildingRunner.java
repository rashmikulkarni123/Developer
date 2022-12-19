package com.xworkz.boot;

import java.time.LocalDateTime;

import com.source.repositary.BuildingRepositaryImpl;
import com.xworkz.constant.Rooms;
import com.xworkz.dto.BuildingDTO;
import com.xworkz.exception.CheckTheDataOnceAgainItsNotMatchingRequriements;
import com.xworkz.exception.SizeIsFullExceptionInitiated;
import com.xworkz.repository.BuildingRepositary;
import com.xworkz.servic.BuildinServiceImpl;

public class BuildingRunner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BuildingDTO dto = new BuildingDTO("Bh","Dubai",Rooms.JANNAT,2000,true);
		BuildingRepositaryImpl repositary = new BuildingRepositaryImpl();
		
		BuildinServiceImpl service = new BuildinServiceImpl(repositary);
		    dto.setCreatedby("Rashr");
			dto.setCreatedDateTime(LocalDateTime.now());
			dto.setUpdatedBy("Rash");
			dto.setUpdatedDateTime(LocalDateTime.now());
			
		
		
			try {
				((BuildinServiceImpl) service).validateAndSaved(dto);
			} catch (CheckTheDataOnceAgainItsNotMatchingRequriements e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SizeIsFullExceptionInitiated e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			finally {
			System.out.println("Execute all data");
			}
	}

}
