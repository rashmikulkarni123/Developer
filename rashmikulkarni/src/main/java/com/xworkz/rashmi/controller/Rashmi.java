package com.xworkz.rashmi.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.rashmi.dto.Beverage;
import com.xworkz.rashmi.dto.Chat;
import com.xworkz.rashmi.dto.Education;
import com.xworkz.rashmi.dto.Family;
import com.xworkz.rashmi.dto.Mobile;

@Component
@RequestMapping("/")
public class Rashmi {
public Rashmi() {
	System.out.println("created rasshmi");
}

@GetMapping("/mail")
public String onEmail(Model model) {
model.addAttribute("Email", "rashus394@gmail.com");
model.addAttribute("mobile", 38582932);
model.addAttribute("Adhar", 34444555);
model.addAttribute("DateOfBirth", LocalDateTime.now());
model.addAttribute("Age", 23);
model.addAttribute("Salary", 25000);
return "index.jsp";

}
@GetMapping("/friends")
public String onFriends(Model model) {
	List<String> dost=new ArrayList<String>();
	dost.add("Yasmeen");
	dost.add("Sahana");
	dost.add("Swati");
	dost.add("Rashmi");
	dost.add("Sinchana");
	model.addAttribute("prends", dost);
	return "index.jsp";
}
@GetMapping("/place")
public String onplace(Model model) {
	List<String> jaga=new ArrayList<String>();
	jaga.add("Mantralayam");
	jaga.add("Tirupati");
	jaga.add("Allimatti");
	jaga.add("Badami");
	model.addAttribute("fevplc", jaga);
	return "index.jsp";
}
@GetMapping("/skills")
public String onskills(Model model) {
	List<String> skil=new ArrayList<String>();
	skil.add("java");
	skil.add("html");
	skil.add("css");
	skil.add("bootstrap");
	model.addAttribute("code", skil);
	return "index.jsp";
}
	@GetMapping("/famlies")
	public String onfamalies(Model model,Family dto) {
		dto.setName("Kulkarni");
		dto.setFamilyMembers("many");
		dto.setHeadOfFamily("daddy");
		dto.setSurename("Kulkarni");
		dto.setPlace("Bagalkot");
		model.addAttribute("name",dto.getName());
		model.addAttribute("setFamilyMembers",dto.getFamilyMembers());
		model.addAttribute("setHeadOfFamily",dto.getHeadOfFamily());
		model.addAttribute("setSurename", dto.getSurename());
		model.addAttribute("setPlace",dto.getPlace());
		return "index.jsp";
	}
	
		@GetMapping("/edu")
		public String onedu(Model model,Education dto) {
			dto.setName("Rashmi");
			dto.setSchoolName("BVVS");
			dto.setLocation("Bagalkot");
			dto.setTeacherName("Mr.Shubham");
		model.addAttribute("name",dto.getName());
		model.addAttribute("setSchoolName",dto.getSchoolName());
		model.addAttribute("setLocation",dto.getLocation());
		model.addAttribute("setTeacherName",dto.getTeacherName());
	return "index.jsp";
		}
			
	@GetMapping("/juice")
	public String onJuice(Model model,Beverage dto) {
	dto.setName("maza");
	dto.setType("cold");
	dto.setColor("yellow");
	dto.setBrand("veg");
	dto.setQuantity("M");
	dto.setContainertype("plastic");
	model.addAttribute("setName",dto.getName());
	model.addAttribute("setType",dto.getType());
	model.addAttribute("setColor",dto.getColor());
	model.addAttribute("setBrand",dto.getBrand());
	model.addAttribute("setQuantity", dto.getQuantity());
	model.addAttribute("etContainertype",dto.getContainertype());
		return "index.jsp";
	}
	
	@GetMapping("/cell")
	public String oncell(Model model,Mobile dto) {
	dto.setName("note nine");
	dto.setBrand("Redmi");
	dto.setVaranty("four");
	
	model.addAttribute("setName",dto.getName());
	model.addAttribute("setBrand", dto.getBrand());
	model.addAttribute("setVaranty",dto.getVaranty());
	return "index.jsp";
}
	@GetMapping("/chts")
	public String onchts(Model model,Chat dto) {
		dto.setName("Sev pori");
		dto.setType("veg");
		dto.setShopname("Bholnath");
		dto.setShopLocation("Bagalkot");
		model.addAttribute("setName",dto.getName());
		model.addAttribute("setType",dto.getType());
		model.addAttribute("setShopname",dto.getShopname());
		model.addAttribute("setShopLocation",dto.getShopLocation());
		return "index.jsp";
}
	
}