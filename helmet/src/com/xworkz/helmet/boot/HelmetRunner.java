package com.xworkz.helmet.boot;

import com.source.dto.HelmetDTO;
import com.source.repositary.HelmetRepositaryImpl;
import com.xworkz.helmet.repository.HelmetRepositary;
import com.xworkz.helmet.service.HelmetService;
import com.xworkz.helmet.service.HelmetServieImpl;

public class HelmetRunner {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

		HelmetRepositary repositary  = new HelmetRepositaryImpl();
		HelmetDTO dto = new HelmetDTO();
		
		HelmetService service = new HelmetServieImpl(repositary);
		boolean succeed = service.saveDataAndModify(dto);
		System.out.println("Success:"+succeed);
		
			
			
			
		

}
}
