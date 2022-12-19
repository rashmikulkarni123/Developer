package com.xworkz.boot;

import java.time.LocalDateTime;

import com.xworkz.dto.BakeryDTO;
import com.xworkz.exception.CheckTheDataOnceAgainItsNotMatchingRequriements;
import com.xworkz.exception.SizeIsFullExceptionInitiated;
import com.xworkz.repository.BakeryRepositary;
import com.xworkz.repository.BakeryRepositaryImpl;
import com.xworkz.servic.BakeryService;
import com.xworkz.servic.BakeryServiceImpl;

public class BakeryRunner {
	public static void main(String[] args) throws CheckTheDataOnceAgainItsNotMatchingRequriements {
		// TODO Auto-generated method stub

   BakeryDTO dto = new BakeryDTO("Ayyangar Bakery","Ayyangar","Vidyagiri BGK","Egg Puff",235687457L);
    dto.setCreatedby("Rash");
	dto.setCreatedDateTime(LocalDateTime.now());
	dto.setUpdatedBy("Rash");
	dto.setUpdatedDateTime(LocalDateTime.now());
	
   BakeryRepositary repositary = new BakeryRepositaryImpl();
   BakeryService service = new BakeryServiceImpl(repositary);		
		
	
   boolean saved;
try
{
	saved = service.validateAndSave(dto);
	  System.out.println(saved);
} 
catch (CheckTheDataOnceAgainItsNotMatchingRequriements e) 
{
	// TODO Auto-generated catch block
	e.printStackTrace();
} 
catch (SizeIsFullExceptionInitiated e) 
{
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 
   
		
	}
}
