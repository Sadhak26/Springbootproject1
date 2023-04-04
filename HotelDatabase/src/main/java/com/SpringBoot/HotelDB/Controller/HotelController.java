package com.SpringBoot.HotelDB.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.HotelDB.Model.Hotel;
import com.SpringBoot.HotelDB.Repository.HotelRepository;

@RestController
@RequestMapping("/api")
public class HotelController {
	@Autowired
	private HotelRepository hotelrepository;
	
	@GetMapping("/show")
	public List<Hotel> getAllDetails(){
		return hotelrepository.findAll();
	}

}
